package com.company;

public class TestArray {

    public static void main(String[] args) {
	// write your code here
        int [] []rating;//declare, define

        //initialize array
        rating = new int [3] [4];//[number of arrays ] [length]

        rating [0] [0]=7;
        rating [0] [1]=3;
        rating [1] [2]=7;
        //[1] [4] =8;//java.lang.ArrayIndexOutOfBoundsException
        rating [1] [3] = 8;
        System.out.println(rating [1] [3]);//8
        System.out.println(rating [1] [1]);//0

        int [] numbers = {6, 7, 2, 4};

        //initialize
        int [][] anotherrating = { {6, 7, 2, 4},
                                   {2, 6, 0, 1},
                                   {6, 7, 2, 4},
                                 };
        System.out.println(anotherrating [1] [3]);//1
        System.out.println(anotherrating [1] [1]);//16

        int [] [] studentMarks = new int[4][4];
        studentMarks[0] [0] = 45;
        studentMarks[0] [1] = 6;
        studentMarks[0] [3] = 9;

        studentMarks[1] [0] = 3;
        studentMarks[1] [1] = 55;
        studentMarks[1] [2] = 58;
        studentMarks[1] [3] = 3;

        studentMarks[2] [0] = 9;
        studentMarks[2] [1] = 66;
        studentMarks[2] [3] = 7;

        studentMarks[0] [0] = 52;

    }//main

    public static int countAbove(int [][] array, int num){
        int counter = 0;
        for (int row = 0; row < array.length; row++);
    }
}
