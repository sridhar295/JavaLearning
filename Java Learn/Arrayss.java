import java.util.Arrays;
import java.util.Scanner;

public class Arrayss {

    /*
     * Arrays
     * An array in Java is a data structure that stores multiple values of the same
     * type in a single variable.
     * Arrays have a fixed size, meaning the number of elements an array can hold is
     * determined when the array is created.
     * dataType[] arrayName = new dataType[arraySize];
     * int[] numbers = new int[5]; // Declares an integer array of size 5
     * numbers[0] = 10; // Assigns values to the array elements
     * numbers[1] = 20;
     * numbers[2] = 30;
     * numbers[3] = 40;
     * numbers[4] = 50;
     */
    public static void main(String[] args) {

        // String play[] = new String[3];
        // play[0] = "Sri";
        // play[1] = "SriDhar";
        // play[2] = "Virat";

        // String plays[] = {"a", "b", "c"};
        // System.out.println(Arrays.toString(plays));
        //Scanner sc = new Scanner(System.in);
        // int num[] = new int[5];
        // for (int i = 0; i <= 4; i++) {
        // num[i] = sc.nextInt();
        // System.out.println(num[i]);

        // }
        // for (int i = 0; i <= 4; i++) {
        // // num[i] = sc.nextInt();
        // System.out.println(num[i]);

        // }
        // System.out.println(num[0]);
        // System.out.println(num[1]);
        // System.out.println(num[2]);
        // System.out.println(num[3]);
        // System.out.println(num[4]);

        // int num = sc.nextInt();
        // int range = sc.nextInt();
        // for(int i = 0 ; i<=range ; i++){
        // int value = i * num;
        // System.out.println("value" + value);
        // }

        // nested for loop

        for (int i = 1; i <=3; i++) {
            for (int j = 1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}