package lesson16;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main2 {

    public static void main(String[] args) throws IOException {

        try (FileInputStream fis = new FileInputStream("helpme.txt")) {
            int read = fis.read();
            while (read >= 0) {
                System.out.print((char) read);
                read = fis.read();
            }
        }
    }
}
