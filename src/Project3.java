public class Project3 {
    public static void main(String[] args) {

        //Create a 2D array of integer values. Print the sum of all numbers.

        int[][] arr = {{2,3,6},{8,2,0},{6,4,2}};

        int sum = 0;

        //or

        int [][] arr2 = new int['x']['y'];

        for (int a = 0; a < 3; a++) {
            for (int b = 0; b < 3; b++) {
                sum += arr[a][b];
            }
        }
        System.out.println("Sum of all element in the array is " + sum);

        
    }
}
