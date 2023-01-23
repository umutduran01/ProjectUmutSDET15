public class Project10 {
    public static void main(String[] args) {

        //Write a java program to find the second largest number in the array?

        int[] arr = {68, 76, 362, 5, 13, 45, 86, 269, 6, 363, 467, 23, 75, 142};

        int max = arr[0];
        int secondLargest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Max value is " + max);

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] < max && arr[j] > secondLargest) {
                secondLargest = arr[j];
            }
        }

        System.out.println("Second largest value is " + secondLargest);

    }
}
