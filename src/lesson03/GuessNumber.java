package lesson03;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    public static void main(String[] args) {
        double d = Math.random(); //[0;1)
        int result = (int) (d * 100 + 1);// * 100[1; 101) -> +1 [1; 101) -> (int) [1;100]

        guessNumber(result);

//        System.out.println(result);
//        System.out.println("введите число от 1 до 100:");
//
//        Scanner scanner = new Scanner(System.in);
//        int x = scanner.nextInt();
//
//        System.out.println("вы ввели число " + x);
//
//        if (x == result) {
//            System.out.println("угадал!!! поздравляем");
//        } else if (x > result) {
//            System.out.println("попробуйте ввести число меньше");
//        } else {
//            System.out.println("попробуйте ввести число больше");
//        }
    }

    public static void guessNumber(int result) {
        System.out.println("введите число от 1 до 100:");

        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        System.out.println("вы ввели число " + x);

        if (x == result) {
            System.out.println("угадал!!! поздравляем");
        } else if (x > result) {
            System.out.println("попробуйте ввести число меньше");
            guessNumber(result);
        } else {
            System.out.println("попробуйте ввести число больше");
            guessNumber(result);
        }
//        } else {
//            String s = x > result ? "меньше" : "больше";
//            System.out.println("попробуйте ввести число " + s);
        System.out.println("попробуйте ввести число " + (x > result ? "меньше" : "больше"));
//            guessNumber(result);
//        }
    }
}
