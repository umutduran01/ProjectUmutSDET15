public class Project5 {
    public static void main(String[] args) {

        //Create a 2D array of integers. Develop a program which will calculate the sum of even and odd numbers for that array.

        int[][] arr = {{5, 4, 7, 9}, {52, 1, 6, 0}, {43, 23, 76, 2}}; //An array of 3x4

        int sumEven = 0;
        int sumOdd = 0;

        for (int a = 0; a < 3; a++) {
            for (int i = 0; i < 4; i++) {
                if (arr[a][i] % 2 == 0) {
                    sumEven += arr[a][i];
                } else {
                    sumOdd += arr[a][i];
                }

            }
        }
        System.out.println("Sum of odd and even numbers is " + (sumEven + sumOdd));

    }
}
