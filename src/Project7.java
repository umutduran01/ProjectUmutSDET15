import java.util.Scanner;

public class Project7 {
    public static void main(String[] args) {

        //Write a java program to check whether a given number is prime or not.

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number to check: ");
        int number = input.nextInt();

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                System.out.println(number + " is not a prime number.");
                return;
            }
        }
        System.out.println(number + " is a prime number.");

    }
}
