package lesson05;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int n = 7;


        int[] ints = new int[n];
        System.out.println(ints);
        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i] + " ");
        }

        for (int i = 0; i < ints.length; i++) {
            ints[i] = new Random().nextInt(100);
        }

        System.out.println();
        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i] + " ");
        }
        System.out.println();
        for (int a : ints) {
            System.out.print(a + " ");
        }

        int[] ints2 = new int[0];
        int[] ints1 = new int[1];
    }
}
