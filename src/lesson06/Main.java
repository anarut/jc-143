package lesson06;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println("hello world");
        int[] a = {1,9,3,2,6,8,4};
        Arrays.sort(a);
        int i = Arrays.binarySearch(a, 7);
        double random = Math.random();

//        lesson06.MainAccess mainAccess = new lesson06.MainAccess();
//        lesson06.access.MainAccess mainAccess2 = new lesson06.access.MainAccess();


        MainAccess mainAccess = new MainAccess();
//        int a = mainAccess.a;
        int b = mainAccess.b;
        int c = mainAccess.c;
        int d = mainAccess.d;
    }
}
