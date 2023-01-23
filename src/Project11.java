public class Project11 {
    public static void main(String[] args) {

        //Write a program to print out duplicate elements from an Array of Strings?

        String[] arr = {"cat", "dog", "milk", "cat", "garden", "air", "animal", "cat", "bird", "animal", "bread"};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i].equals(arr[j])) {
                    System.out.println("Index " + i + " is " + arr[i] + " and it is duplicated at index " + j + " which is also " + arr[j]);
                }
            }
        }

    }
}
