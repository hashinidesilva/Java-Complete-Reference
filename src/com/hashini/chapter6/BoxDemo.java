package com.hashini.chapter6;

class Box {
    double width;
    double height;
    double depth;
}

public class BoxDemo {
    public static void main(String[] args) {
        Box myBox1 = new Box();
        double vol1;

        myBox1.width = 10;
        myBox1.height = 10;
        myBox1.depth = 10;

        vol1 = myBox1.width * myBox1.height * myBox1.depth;
        System.out.println(vol1);

        Box myBox2 = new Box();
        double vol2;

        myBox2.width = 20;
        myBox2.height = 20;
        myBox2.depth = 20;

        vol2 = myBox2.width * myBox2.height * myBox2.depth;
        System.out.println(vol2);
    }
}
