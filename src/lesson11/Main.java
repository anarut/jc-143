package lesson11;

import lesson10.GenericAccount;

import java.util.Random;
import java.util.regex.Pattern;

public class Main {

    static {

    }
    {
        a = 7;
    }

    int a = 5;
    static int b = someInt();

    static {

    }


    public static int someInt() {
        return new Random().nextInt(1000);
    }
    public static void main(String[] args) {
        for (int i = 0, j = 0; i < 10; i++) {

        }
        int c = 5;
        {
            int a = 5;
            int b = c;
        }

        System.out.println(c);

        {

        }
        int length = "".toString().toString().toString().toCharArray().length;

        boolean b = "" == "";
        boolean equals = "".equals("");
        int i = "".compareTo("");

        Pattern compile = Pattern.compile(".+a*g*sd*g*");

        GenericAccount<int[], Double> objectNumberGenericAccount =
                new GenericAccount<>();

        int[] id = objectNumberGenericAccount.getId();
        System.out.println();

        Second second = new Second();
    }
}
