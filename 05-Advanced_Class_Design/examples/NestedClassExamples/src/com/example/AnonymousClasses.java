
package com.example;

public class AnonymousClasses {

    interface CompStringLength {

        public void computeLength(String str);
    }

    static CompStringLength strlength = new CompStringLength() {

        @Override
        public void computeLength(String str) {
            int strlen = str.length();
            System.out.println("length of a string " + strlen);
        }
    };

    public static void main(String args[]) {
        strlength.computeLength("helloworld");
        strlength.computeLength("java se 8 programming");
        strlength.computeLength("");
    }

}
