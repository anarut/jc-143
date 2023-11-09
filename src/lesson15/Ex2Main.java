package lesson15;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Random;

public class Ex2Main {

    public static void main(String[] args) {
        InputStream in = System.in;

        try {
            average();
        } catch (FileNotFoundException e) {
            System.out.println("ne mogy");
            e.printStackTrace();
        }
        try {
            piy();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }

    }

    public static int piy() { ///throws RuntimeException {
        if (new Random().nextBoolean()) {
            throw new RuntimeException("18 year required!");
        }
        return 0 / 0;
    }
    public static int average() throws FileNotFoundException {
        InputStream fileInputStream = new FileInputStream("help.txt");
        return 0;
    }
}
