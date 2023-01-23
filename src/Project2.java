import java.util.Scanner;

public class Project2 {
    public static void main(String[] args) {

        /*
        Using Scanner create an array of countries.
        When an array is created, retrieve all values from it and while retrieving those values print capital for each country. (use 2 different loops).
        */

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter array length: ");
        int arrLength = input.nextInt(); //Scanner to enter array length.

        String[] arrCountries = new String[arrLength]; //Array length is set.

        for (int x = 0; x < arrCountries.length; x++) {
            System.out.print("Please enter country name at index " + x + ": "); //For loop to insert indexes.
            arrCountries[x] = input.next();
        }

        for (int a = 0; a < arrCountries.length; a++) { //For loop to print country and its capital.
            if (arrCountries[a].equals("Turkey")) {
                System.out.println("Turkey's capital is Ankara.");
            } else if (arrCountries[a].equals("Germany")) {
                System.out.println("Germany's capital is Berlin.");
            } else if (arrCountries[a].equals("France")) {
                System.out.println("France's capital is Paris.");
            } else if (arrCountries[a].equals("Portugal")) {
                System.out.println("Portugal's capital is Lisbon.");
            } else if (arrCountries[a].equals("Spain")) {
                System.out.println("Spain's capital is Madrid.");
            }
        }
    }
}
