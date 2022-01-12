import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Locale;

public class PrintClass {
    public static void main(String[] args){

        // Program to Print an Array
        System.out.println("Integers Array iteration: ");
        int[] arrayOne = {12,23,34,54,65,76};
        for(int element:arrayOne){
            System.out.println(element);
        }
        System.out.println();

        System.out.println("Strings Array iteration: ");
        String[] arrayStr = {"Java","Python","C","C++","Ruby"};
        for(String iterate : arrayStr){
            System.out.println(iterate);
        }

        //Concatenate Two Arrays
        int[] arrayTwo = {98,76,34,56,64,23};
        int a = arrayOne.length;
        int b = arrayTwo.length;
        int[] finalArray = new int[a+b];

        System.arraycopy(arrayOne,0, finalArray,0, a);
        System.arraycopy(arrayTwo,0, finalArray, a, b);
        System.out.println("Concatenate two arrays: "+ Arrays.toString(finalArray));

        //Check if An Array Contains a Given Value
        int give = 23;
        boolean found = false;

        for(int element : finalArray){

            if(element == give){
                System.out.println(give + " is found in array!!");
                found = true;
                break;
            }
        }
        if(!found)
            System.out.println(give + " is not found in array!!");

    }
}
