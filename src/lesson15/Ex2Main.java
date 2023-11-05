package lesson15;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class Ex2Main {

    public static void main(String[] args) {
        InputStream in = System.in;

        try {
            average();
        } catch (FileNotFoundException e) {
            System.out.println("ne mogy");
            e.printStackTrace();
        }
    }

    public static int average() throws FileNotFoundException {
        InputStream fileInputStream = new FileInputStream("help.txt");
        return 0;
    }
}
