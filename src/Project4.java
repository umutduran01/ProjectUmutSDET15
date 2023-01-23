public class Project4 {
    public static void main(String[] args) {

        //Create a 2D array or integer type where you will store odd and even numbers. Develop a program which will identify/print the even numbers only.

        int[][] numbers = {{32, 85, 97, 64, 2}, {81, 77, 93, 24,33}, {46, 2, 7, 19,21}}; //Array of 3x5

        for (int a = 0; a <3 ; a++) {
            for (int b = 0; b < 5; b++) {
                if(numbers[a][b] % 2 == 0){
                    System.out.println(numbers[a][b]);
                }
            }
        }

    }
}

