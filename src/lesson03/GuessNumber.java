package lesson03;

import java.util.Scanner;

public class GuessNumber {

    final int a;
    static int b;
    public static final float PI = 3.14f;

    public GuessNumber(int a) {
        this.a = a;
    }

    public static void main(String[] args) {
        double d = Math.random(); //[0;1)
        int result = (int) (d * 100 + 1);// * 100[1; 101) -> +1 [1; 101) -> (int) [1;100]

        GuessNumber guessNumber = new GuessNumber(2);
        guessNumber.guessNumber(result);

        GuessNumber.test(44);

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

    public static final void test(int result) {
        int be = b;
    }

    public void guessNumber(int result) {
        int a1 = a;
        int b1 = b;

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
