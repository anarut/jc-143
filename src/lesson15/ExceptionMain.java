package lesson15;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionMain {

    static int i;
    public static void main(String[] args) {
        todo();
    }

    public static int todo() {
        try {
            Scanner scanner = new Scanner(System.in);
            int i = scanner.nextInt();
            if (i > 100 || i < 1) {
                IllegalArgumentException ex = new IllegalArgumentException("Must be in range [1:100] but " + i);
                throw ex;
            }

            int a = 4 / 0;
//            System.out.println(a);
        } catch (ArithmeticException e) {
//            e.printStackTrace();
            System.out.println("ай ай ай математик - " + e.getLocalizedMessage());
            return 1;
        } catch (InputMismatchException e) {
            System.out.println("кривые руки? - " + e.getLocalizedMessage());
            return 1;
        } catch (Exception exxx) {
            System.out.println(exxx.getClass());
            System.out.println("не знаю -" + exxx.getMessage());
            return 1;
        } catch (Throwable ignored) {

        } finally {
            System.out.println("finish!!!");
        }

        System.out.println("finish app");
        return 0;
    }


    public static void test() {
        System.out.println(++i);
        test();
    }
}
