package lesson16;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjMain2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        try (var fis = new FileInputStream("persons.txt");
             var bis = new BufferedInputStream(fis);
             var ois = new ObjectInputStream(bis)) {

            final Object o1 = ois.readObject();
            final Object o2 = ois.readObject();

            System.out.println(o1);
            System.out.println(o2);
        }
    }
}
