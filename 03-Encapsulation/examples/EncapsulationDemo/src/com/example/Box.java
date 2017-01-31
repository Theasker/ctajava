package com.example;


public class Box {

    private double length, width, height;

    public Box() {
        this.length = 1;
        this.height = 1;
        this.width = 1;

    }

    public Box(double length) {
        this.width = this.length = this.height = length;

    }

    public Box(double length, double width, double height) {
        this.length = length;
        this.height = height;
        this.width = width;
        System.out.println("and the height of " + height + ".");
    }

    double volume() {

        return width * height * length;
    }

    public static void main(String args[]) {
        double vol;
        Box mybox1 = new Box();

        Box mybox2 = new Box(5.5);

        Box mybox3 = new Box(2.3, 4.5, 6.6);
        vol = mybox1.volume();
        System.out.println(" volume of mybox1 " + vol);
        vol = mybox2.volume();
        System.out.println(" volume of mybox2 " + vol);
        vol = mybox3.volume();
        System.out.println(" volume of mybox3 " + vol);
    }

}
