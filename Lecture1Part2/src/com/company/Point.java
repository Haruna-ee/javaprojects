package com.company;

public class Point {
    //attributes, class fields x, y
//    constructor
//    setters and getters
//    write a new method in point called scale, that will make the point closer by half to (0,0)
//  so for example, point (8,4) after scale will be (4, 2)
//    toString
//    Write a method getDistance() to calculate distance between 2 points
//     this point and another point
//    Hint: Pythagorean Theorem

    //    Write a method getDistanceFromOrigin() to calculate distance between
//    the current point and another point the origin (0,0)
    int x;
    int y;



    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void scale() {
        this.x = this.x / 2;
        this.y = this.y / 2;
//       int a=m/2;
//        return ;
//        System.out.println(this.x  /2);
    }

    public void getDistance() {
//        this.x = this.x - ;
//        this.y = this.y - this.n;

    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
