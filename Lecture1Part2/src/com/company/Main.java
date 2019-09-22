package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
//
        Point p = new Point(4, 2);
//        System.out.println(p);
        p.scale();
//        System.out.println(p);
        Point u = new Point(40,38);
        u.scale();
//        System.out.println(u);
        Point a = new Point(6, 4);
        Point b = new Point(10, 5);
        a.getDistance();
        b.getDistance();
        System.out.println(a);
        System.out.println(b);
    }
}
