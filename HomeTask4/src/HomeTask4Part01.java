public class HomeTask4Part01 {
    public static void main(String[] args) {
        		/*
		 * 1. Initialize array.
2. Print array.
3. Find minimum.
4. Find maximum.
5. Find average.
6. Sort using Selection Sort. Print result. Reassign the initial values to the array before
performing Bubble Sort.
7. Sort using Bubble Sort.
8. Reverse the array.
		 */
        int[] array = {77, 20, 2, 33, 1994, -5, 87, 566, 6};// initializing array
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("Minimum : " + minimum(array));// printing minimum
        System.out.println();
        System.out.println("Maximum : " + maximum(array));//printing maximum
        System.out.println();
        System.out.println("Average : " + average(array));//printing average
        System.out.println();
        System.out.println();
        int[] sortedArray = selectionSort(array);

        for (int i = 0; i < sortedArray.length; i++) {
            System.out.print(sortedArray[i] + " ");// Printing the sorted array with selection sort
        }


        System.out.println();

        array[0] = 77;
        array[1] = 20;
        array[2] = 2;
        array[3] = 33;
        array[4] = 1994;
        array[5] = -5;
        array[6] = 87;
        array[7] = 566;
        array[8] = 6;
        System.out.println();
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");//printing the reassigned elements of the array
        System.out.println();
        int[] sortArray = bubbleSort(array);
        System.out.println();
        for (int i = 0; i < sortArray.length; i++) {

            System.out.print(sortArray[i] + " ");//printing the array with bubblesort
        }

        System.out.println();
        int[] rArray = reverse(array);
        int n = 0;
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");//printing the reverse array
        }


    }


    private static int minimum(int[] array) {
        int minimum = array[0];
        for (int i = 1; i < array.length; i++) {
            // compare minValue with current value
            if (array[i] < minimum) {
                minimum = array[i];
            }
        }//end of for
        return minimum;
    }

    private static int maximum(int[] array) {
        int maximum = array[0];
        for (int i = 1; i < array.length; i++) {
            // compare minValue with current value
            if (array[i] > maximum) {
                maximum = array[i];
            }
        }//end of for
        return maximum;
    }

    private static double average(int[] array) {
        int sum = 0;
        double average = 0;

        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        average = (double) sum / array.length;
        //     System.out.println(array.average());

        return average;

    }

    private static int[] selectionSort(int[] array) {
        int n = array.length;

        for (int k = 0; k < n - 1; k++) {

            // find the minimum element
            int min_index = k;
            for (int i = k + 1; i < n; i++) {
                if (array[i] < array[min_index]) {
                    min_index = i;
                }
            }
            // Swap the found minimum element with the first element
            int temporal = array[min_index];
            array[min_index] = array[k];
            array[k] = temporal;
        } // end of external loop

        return array;
    }

    /*	public static int []  bubbleSort(int [] array) {
            int k = 0;
            int n = array.length;
            boolean swapMade = true;


            while((k < n-1) && swapMade) {
                swapMade = false;
                k++;
                for (int j = 0; j <n-k; j++) {
                    if (array[j] > array[j + 1]) {
                        swap(array, j, j+1);
                        swapMade = true;
                    }
                }
            }
            return array;
        }*/
    private static int[] bubbleSort(int[] array) {
        int counter = 0;
        int temp = -1000;
        int n = array.length;
        for (int j = 0; j < n - 1; j++) { //external loop

            for (int i = 0; i < n - j - 1; i++) {//internal loop
                counter++;
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;

                }// end of if

            }//end of internal loop

        }//end of external loop
        return array;

    }

    private static int[] reverse(int[] array) {
        int n = array.length;
        //array[0] <--> array[ n - 1 ]
        //array[1] <--> array[ n - 1 - 1 ]
        //int temp;
        int temp;
        //for loop
        for (int i = 0; i < n; i++) {

            temp = array[i];
            array[i] = array[n - 1 - i];
            array[n - 1 - i] = temp;

            System.out.print(array[i] + " ");

        }
        return array;
    }

   /*  int temp;
        int firstElement = 0;
        int lastElement = array.length - 1;

        while (firstElement < lastElement) {
            temp = list[firstElement];
            array[firstElement] = array[lastElement];
            array[lastElement] = temp;

            firstElement++;
            lastElement--;
        }*/
    private static int[] reverseR(int[] array) {
        int temp;
        int firstElement = 0;
        int lastElement = array.length - 1;

        while (firstElement < lastElement) {
            temp = list[firstElement];
            array[firstElement] = array[lastElement];
            array[lastElement] = temp;

            firstElement++;
            lastElement--;

        }
        return array;
    }
}



