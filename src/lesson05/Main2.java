package lesson05;

import java.util.Arrays;
import java.util.Random;

public class Main2 {

    public static void main(String[] args) {
        int[][] arr  = new int[5][5];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        int[] ints = arr[0];
        System.out.println(ints.length);

        arr[0] = new int[3];
        arr[1] = new int[6];
        arr[2] = new int[0];
        arr[3] = new int[7];
        arr[4] = new int[2];
        Arrays.fill(ints, 11);
        System.out.println(Arrays.toString(ints));
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = new Random().nextInt(10);
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
