package com.company;

import com.Box;

public class Main {

    public static void main(String[] args) {
        // write your code here
//        box objects
        Box alpha = new Box(4, 7, 9.2, "Purple", "paper", false);
        Box beta = new Box(2.1, 4.8, 5.86, "pink", "plastic", true);
        Box omega = new Box(3.4, 4.7, 8.1, "blue", "wood", false);
//        array
        Box[] boxes = {alpha, beta, omega};
//        calculating volumes of boxes
        System.out.println("Volume of box alpha is : " + alpha.calculateVolume());
        System.out.println("Volume of box beta is : " + beta.calculateVolume());
        System.out.println("Volume of box omega : " + omega.calculateVolume());
//        for loop
//        for (Box r : boxes) {
//            System.out.println(r);
//        }
//
//        for (int i = 0; i < boxes.length; i++ ) {
//            System.out.println(boxes[i].getColour());
//        }
//        for (int i = 0; i < boxes.length; i++){
//            System.out.println(boxes[i].isReusable());
//        }
        for (int i = 0; i < boxes.length; i++) {
            System.out.println(boxes[i]);
        }

    }
}
