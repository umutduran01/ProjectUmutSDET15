import java.util.Arrays;

public class Project9 {
    public static void main(String[] args) {

        //Maximum and minimum number in the array?

        int [] arr = {12,76,36,5,13,72,86,269,6,15,67,23,75,170};

        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Max is " + max);

        int min = arr[0];

        for (int j = 1; j < arr.length; j++) {
            if (arr[j] < min){
                min = arr[j];
            }
        }
        System.out.println("Min is " + min);
    }
}
