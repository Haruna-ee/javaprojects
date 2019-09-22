import java.io.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HomeTask2 {
    /*
    the average temperature at this location,
    the warmest temperature at this location,
    the coldest temperature at this location, and
    the average temperature if we exclude the two extremes.*/
    private static int avgT(int [] temperatures){//method to calculate average temp
        int avg, sum;
        sum = 0;
        for (int i = 0; i < temperatures.length; i++){

            sum = sum +  temperatures [i];
        }
        avg = sum / temperatures.length;
        return avg;

    }
    private static int warmestTemp(int []temperatures){//method printing warmest temperature
        System.out.println("////// " + temperatures.length);
        int warmestT = temperatures [0];
        System.out.println("//////==== " + warmestT);
        for (int i = 1; i < temperatures.length; i++) {
            if (temperatures [i] > warmestT) {
                warmestT = temperatures[i];
            }
        }
        System.out.println("////// " + warmestT);

        return warmestT;
    }
    private static int coldestTemp(int [] temperatures){//method printing coldest temperature
        int coldestT = temperatures [0];
        for (int i = 0; i < temperatures.length; i ++){
            if (temperatures[i] < coldestT){
                coldestT = temperatures [i];
            }
        }
        return coldestT;
    }
    private static int avgTempExceptions(int [] temperatures){
       int avgExceptions, sumExceptions;
     //  counter = 0;
        avgExceptions = 0;
        sumExceptions = 0;
        for (int i = 1; i < temperatures.length; i++){
            sumExceptions = sumExceptions / temperatures.length;
//counter ++;
        }
        return avgExceptions;
    }

   public static void readLines(File file) throws IOException {
      //  FileReader fileReader = new FileReader(file);
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line;
        while ((line = reader.readLine()) != null) {
            int[] temperatures = new int [7];
            String [] newArray = line.split(" ");
            List<String> country = new ArrayList<>();
            List<Integer> temperaturesa = new ArrayList<>();
            for (String nameOfFile : newArray ){
                try {
                    Integer temp = Integer.parseInt(nameOfFile);
                   temperaturesa.add(temp);
                } catch (NumberFormatException exception){
                   country.add(nameOfFile);
                }
                String countryT = String.join(" ", country);
                System.out.println(countryT);
                System.out.println(temperaturesa);
            }

            // process the line.
           // System.out.println(line);

        }
      //  reader.close();
       // fileReader.close();
    }


    public static void main(String[] args) throws IOException /*throws IOException*/ {

        Scanner input = new Scanner(System.in);
        System.out.println("Input file name::");
        String nameOfFile = input.nextLine();
        int[] temperatures = new int [7];
       File file = new File("temperatures.txt");
        readLines(file);//method to read the file

        //19 10 18 20 17 21 16
        double averageTemp = avgT(temperatures);
     System.out.println("average " + avgT(temperatures));
        System.out.println("warmest temperature " + warmestTemp(temperatures));
        System.out.println("coldest temperature " + coldestTemp(temperatures));
        System.out.println( "average temperature when we exclude the two extremes" + avgTempExceptions(temperatures));
      /*  int averageTemp = avgT(temperatures);
        System.out.println("The average temperature  is: " + averageTemp);*/



    }
}