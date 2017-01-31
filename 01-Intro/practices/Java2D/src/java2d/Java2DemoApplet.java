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


import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.Rectangle;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JApplet;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;


/**
 * A demo that shows Java2D features.
 *
 * Parameters that can be used in the Java2Demo.html file inside
 * the applet tag to customize demo runs :
<param name="runs" value="10">
<param name="delay" value="10">
<param name="ccthread" value=" ">
<param name="screen" value="5">
<param name="antialias" value="true">
<param name="rendering" value="true">
<param name="texture" value="true">
<param name="composite" value="true">
<param name="verbose" value=" ">
<param name="buffers" value="3,10">
<param name="verbose" value=" ">
<param name="zoom" value=" ">
 *
 * @author Brian Lichtenwalter  (Framework, Intro, demos)
 * @author Jim Graham           (demos)
 * @author Alexander Kouznetsov (code beautification)
 */
@SuppressWarnings("serial")
public class Java2DemoApplet extends JApplet {

    public static JApplet applet;

    @Override
    public void init() {

        applet = this;

        JPanel panel = new JPanel();
        getContentPane().add(panel, BorderLayout.CENTER);
        panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));

        JPanel progressPanel = new JPanel() {

            @Override
            public Insets getInsets() {
                return new Insets(40, 30, 20, 30);
            }
        };
        progressPanel.setLayout(new BoxLayout(progressPanel, BoxLayout.Y_AXIS));

        panel.add(Box.createGlue());
        panel.add(progressPanel);
        panel.add(Box.createGlue());

        progressPanel.add(Box.createGlue());

        Dimension d = new Dimension(400, 20);
        Java2Demo.progressLabel = new JLabel("Loading, please wait...");
        Java2Demo.progressLabel.setMaximumSize(d);
        progressPanel.add(Java2Demo.progressLabel);
        progressPanel.add(Box.createRigidArea(new Dimension(1, 20)));

        Java2Demo.progressBar = new JProgressBar();
        Java2Demo.progressBar.setStringPainted(true);
        Java2Demo.progressLabel.setLabelFor(Java2Demo.progressBar);
        Java2Demo.progressBar.setAlignmentX(CENTER_ALIGNMENT);
        Java2Demo.progressBar.setMaximumSize(d);
        Java2Demo.progressBar.setMinimum(0);
        Java2Demo.progressBar.setValue(0);
        progressPanel.add(Java2Demo.progressBar);
        progressPanel.add(Box.createGlue());
        progressPanel.add(Box.createGlue());

        Rectangle ab = getContentPane().getBounds();
        panel.setPreferredSize(new Dimension(ab.width, ab.height));
        getContentPane().add(panel, BorderLayout.CENTER);
        validate();
        setVisible(true);

        Java2Demo.demo = new Java2Demo();
        getContentPane().remove(panel);
        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(Java2Demo.demo, BorderLayout.CENTER);

        String param = null;

        if ((param = getParameter("delay")) != null) {
            RunWindow.delay = Integer.parseInt(param);
        }
        if (getParameter("ccthread") != null) {
            Java2Demo.ccthreadCB.setSelected(true);
        }
        if ((param = getParameter("screen")) != null) {
            GlobalControls.screenCombo.setSelectedIndex(Integer.parseInt(param));
        }
        if ((param = getParameter("antialias")) != null) {
            Java2Demo.controls.aliasCB.setSelected(param.endsWith("true"));
        }
        if ((param = getParameter("rendering")) != null) {
            Java2Demo.controls.renderCB.setSelected(param.endsWith("true"));
        }
        if ((param = getParameter("texture")) != null) {
            Java2Demo.controls.textureCB.setSelected(param.endsWith("true"));
        }
        if ((param = getParameter("composite")) != null) {
            Java2Demo.controls.compositeCB.setSelected(param.endsWith("true"));
        }
        if (getParameter("verbose") != null) {
            Java2Demo.verboseCB.setSelected(true);
        }
        if ((param = getParameter("columns")) != null) {
            DemoGroup.columns = Integer.parseInt(param);
        }
        if ((param = getParameter("buffers")) != null) {
            // usage -buffers=3,10
            RunWindow.buffersFlag = true;
            int i = param.indexOf(',');
            String s1 = param.substring(0, i);
            RunWindow.bufBeg = Integer.parseInt(s1);
            s1 = param.substring(i + 1, param.length());
            RunWindow.bufEnd = Integer.parseInt(s1);
        }
        if (getParameter("zoom") != null) {
            RunWindow.zoomCB.setSelected(true);
        }
        if ((param = getParameter("runs")) != null) {
            RunWindow.numRuns = Integer.parseInt(param);
            Java2Demo.demo.createRunWindow();
            RunWindow.runB.doClick();
        }
        validate();
        repaint();
        requestDefaultFocus();
    }

    private void requestDefaultFocus() {
        Container nearestRoot = getFocusCycleRootAncestor();
        if (nearestRoot != null) {
            nearestRoot.getFocusTraversalPolicy().getDefaultComponent(
                    nearestRoot).requestFocus();
        }
    }

    @Override
    public void start() {
        Java2Demo.demo.start();
    }

    @Override
    public void stop() {
        Java2Demo.demo.stop();
    }
}
