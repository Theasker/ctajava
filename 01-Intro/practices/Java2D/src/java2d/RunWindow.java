/*
 *
 * Copyright (c) 2007, 2011, Oracle and/or its affiliates. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *   - Redistributions of source code must retain the above copyright
 *     notice, this list of conditions and the following disclaimer.
 *
 *   - Redistributions in binary form must reproduce the above copyright
 *     notice, this list of conditions and the following disclaimer in the
 *     documentation and/or other materials provided with the distribution.
 *
 *   - Neither the name of Oracle nor the names of its
 *     contributors may be used to endorse or promote products derived
 *     from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS
 * IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED.  IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package java2d;


import static java.awt.Color.BLACK;
import static java.awt.Color.GREEN;
import static java.awt.Color.RED;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;


/**
 * A separate window for running the Java2Demo.  Go from tab to tab or demo to
 * demo.
 */
@SuppressWarnings("serial")
public class RunWindow extends JPanel implements Runnable, ActionListener {

    static JButton runB;
    static int delay = 10;
    static int numRuns = 20;
    static boolean exit;
    static JCheckBox zoomCB = new JCheckBox("Zoom");
    static JCheckBox printCB = new JCheckBox("Print");
    static boolean buffersFlag;
    static int bufBeg, bufEnd;
    private JTextField delayTextField, runsTextField;
    private Thread thread;
    private JProgressBar pb;

    @SuppressWarnings("LeakingThisInConstructor")
    public RunWindow() {

        setLayout(new GridBagLayout());
        EmptyBorder eb = new EmptyBorder(5, 5, 5, 5);
        setBorder(new CompoundBorder(eb, new BevelBorder(BevelBorder.LOWERED)));

        Font font = new Font("serif", Font.PLAIN, 10);

        runB = new JButton("Run");
        runB.setBackground(GREEN);
        runB.addActionListener(this);
        runB.setMinimumSize(new Dimension(70, 30));
        Java2Demo.addToGridBag(this, runB, 0, 0, 1, 1, 0.0, 0.0);

        pb = new JProgressBar();
        pb.setPreferredSize(new Dimension(100, 30));
        pb.setMinimum(0);
        Java2Demo.addToGridBag(this, pb, 1, 0, 2, 1, 1.0, 0.0);

        JPanel p1 = new JPanel(new GridLayout(2, 2));
        JPanel p2 = new JPanel();
        JLabel l = new JLabel("Runs:");
        l.setFont(font);
        l.setForeground(BLACK);
        p2.add(l);
        p2.add(runsTextField = new JTextField(String.valueOf(numRuns)));
        runsTextField.setPreferredSize(new Dimension(30, 20));
        runsTextField.addActionListener(this);
        p1.add(p2);
        p2 = new JPanel();
        l = new JLabel("Delay:");
        l.setFont(font);
        l.setForeground(BLACK);
        p2.add(l);
        p2.add(delayTextField = new JTextField(String.valueOf(delay)));
        delayTextField.setPreferredSize(new Dimension(30, 20));
        delayTextField.addActionListener(this);
        p1.add(p2);

        zoomCB.setHorizontalAlignment(SwingConstants.CENTER);
        zoomCB.setFont(font);
        printCB.setFont(font);
        p1.add(zoomCB);
        p1.add(printCB);
        printCB.addActionListener(this);
        Java2Demo.addToGridBag(this, p1, 0, 1, 3, 1, 1.0, 1.0);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(printCB)) {
            Java2Demo.printCB.setSelected(printCB.isSelected());
        } else if (e.getSource().equals(delayTextField)) {
            delay = Integer.parseInt(delayTextField.getText().trim());
        } else if (e.getSource().equals(runsTextField)) {
            numRuns = Integer.parseInt(runsTextField.getText().trim());
        } else if ("Run".equals(e.getActionCommand())) {
            doRunAction();
        } else if ("Stop".equals(e.getActionCommand())) {
            stop();
        }
    }

    public void doRunAction() {
        runB.setText("Stop");
        runB.setBackground(RED);
        start();
    }

    public void start() {
        thread = new Thread(this);
        thread.setPriority(Thread.NORM_PRIORITY + 1);
        thread.setName("RunWindow");
        thread.start();
    }

    public synchronized void stop() {
        if (thread != null) {
            thread.interrupt();
        }
        thread = null;
        notifyAll();
    }

    @SuppressWarnings("SleepWhileHoldingLock")
    public void sleepPerTab() {
        for (int j = 0; j < delay + 1 && thread != null; j++) {
            for (int k = 0; k < 10 && thread != null; k++) {
                try {
                    Thread.sleep(100);
                } catch (Exception e) {
                }
            }
            Runnable pbUpdateRunnable = new Runnable() {

                @Override
                public void run() {
                    pb.setValue(pb.getValue() + 1);
                }
            };
            SwingUtilities.invokeLater(pbUpdateRunnable);
        }
    }

    private void printDemo(final DemoGroup dg) {
        Runnable printDemoRunnable = new Runnable() {

            @Override
            public void run() {
                if (!Java2Demo.controls.toolBarCB.isSelected()) {
                    Java2Demo.controls.toolBarCB.setSelected(true);
                    dg.invalidate();
                }
                for (Component comp : dg.getPanel().getComponents()) {
                    DemoPanel dp = (DemoPanel) comp;
                    if (dp.tools != null) {
                        if (dp.surface.animating != null) {
                            if (dp.surface.animating.running()) {
                                dp.tools.startStopB.doClick();
                            }
                        }
                        dp.tools.printB.doClick();
                    }
                }
            }
        };
        invokeAndWait(printDemoRunnable);
    }
    private DemoGroup dg = null;
    private DemoPanel dp = null;

    @Override
    public void run() {

        System.out.println("\nJava2D Demo RunWindow : " + numRuns + " Runs, "
                + delay + " second delay between tabs\n" + "java version: " + System.
                getProperty("java.version") + "\n" + System.getProperty(
                "os.name") + " " + System.getProperty("os.version") + "\n");
        Runtime r = Runtime.getRuntime();

        for (int runNum = 0; runNum < numRuns && thread != null; runNum++) {

            Date d = new Date();
            System.out.print("#" + runNum + " " + d.toString() + ", ");
            r.gc();
            float freeMemory = r.freeMemory();
            float totalMemory = r.totalMemory();
            System.out.println(((totalMemory - freeMemory) / 1024) + "K used");

            for (int i = 0; i < Java2Demo.tabbedPane.getTabCount() && thread
                    != null; i++) {

                final int mainTabIndex = i;
                Runnable initDemoRunnable = new Runnable() {

                    @Override
                    public void run() {
                        pb.setValue(0);
                        pb.setMaximum(delay);
                        if (mainTabIndex != 0) {
                            dg = Java2Demo.group[mainTabIndex - 1];
                            dg.invalidate();
                        }
                        Java2Demo.tabbedPane.setSelectedIndex(mainTabIndex);
                    }
                };
                invokeAndWait(initDemoRunnable);

                if (i != 0 && (zoomCB.isSelected() || buffersFlag)) {
                    dp = (DemoPanel) dg.getPanel().getComponent(0);
                    if (dg.tabbedPane == null && dp.surface != null) {
                        Runnable mouseClickedRunnable = new Runnable() {

                            @Override
                            public void run() {
                                dg.mouseClicked(dp.surface);
                            }
                        };
                        invokeAndWait(mouseClickedRunnable);
                    }
                    for (int j = 1; j < dg.tabbedPane.getTabCount() && thread
                            != null; j++) {

                        final int subTabIndex = j;

                        Runnable initPanelRunnable = new Runnable() {

                            @Override
                            public void run() {
                                pb.setValue(0);
                                pb.setMaximum(delay);
                                dg.tabbedPane.setSelectedIndex(subTabIndex);
                            }
                        };
                        invokeAndWait(initPanelRunnable);

                        final JPanel p = dg.getPanel();
                        if (buffersFlag && p.getComponentCount() == 1) {
                            dp = (DemoPanel) p.getComponent(0);
                            if (dp.surface.animating != null) {
                                dp.surface.animating.stop();
                            }
                            for (int k = bufBeg; k <= bufEnd && thread != null;
                                    k++) {

                                final int cloneIndex = k;
                                Runnable cloneRunnable = new Runnable() {

                                    @Override
                                    public void run() {
                                        dp.tools.cloneB.doClick();
                                        int n = p.getComponentCount();
                                        DemoPanel clone = (DemoPanel) p.
                                                getComponent(n - 1);
                                        if (clone.surface.animating != null) {
                                            clone.surface.animating.stop();
                                        }
                                        clone.tools.issueRepaint = true;
                                        clone.tools.screenCombo.setSelectedIndex(
                                                cloneIndex);
                                        clone.tools.issueRepaint = false;
                                    }
                                };
                                invokeAndWait(cloneRunnable);
                            }
                        }
                        if (printCB.isSelected()) {
                            printDemo(dg);
                        }
                        sleepPerTab();
                    }
                } else if (i != 0 && printCB.isSelected()) {
                    printDemo(dg);
                    sleepPerTab();
                } else {
                    sleepPerTab();
                }
            }
            if (runNum + 1 == numRuns) {
                System.out.println("Finished.");
                if (exit && thread != null) {
                    System.out.println("System.exit(0).");
                    System.exit(0);
                }
            }
        }
        Runnable resetRunnable = new Runnable() {

            @Override
            public void run() {
                runB.setText("Run");
                runB.setBackground(GREEN);
                pb.setValue(0);
            }
        };
        invokeAndWait(resetRunnable);

        thread = null;
        dg = null;
        dp = null;
    }

    private static void invokeAndWait(Runnable run) {
        try {
            SwingUtilities.invokeAndWait(run);
        } catch (Exception e) {
            Logger.getLogger(RunWindow.class.getName()).log(Level.SEVERE,
                    "ERROR in invokeAndWait", e);
        }
    }
}
