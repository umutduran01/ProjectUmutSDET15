import java.util.Scanner;

public class Project1 {
    public static void main(String[] args) {

        //Using Scanner create an array of integer values. After the array is created, calculate the sum of all stored elements in that array.

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter array length: ");
        int arrLength = input.nextInt(); //Scanner to enter array length.

        int [] arr = new int[arrLength]; //Array length is set.

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Please enter array index " +i + ": "); //For loop to insert indexes.
            arr[i] = input.nextInt();
        }

        int arrSum = 0;

        for (int a = 0; a < arr.length; a++) {
            arrSum += arr[a];
        }

        System.out.println("Array sum is " + arrSum + ".");

    }
}
