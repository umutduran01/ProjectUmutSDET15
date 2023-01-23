import java.util.Scanner;

public class Project8 {
    public static void main(String[] args) {

        //Write a Java Program to print the first 10 numbers of Fibonacci series.

        //0,1,1,2,3,5,8...

        int a = 0;
        int b = 1;
        int sum;

        for (int i = 1; i <= 10; i++) {

            System.out.print(a + ", ");
            sum = a + b;
            a = b;
            b = sum;

        }

    }
}
