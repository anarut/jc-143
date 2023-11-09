package lesson16;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjMain {

    public static void main(String[] args) throws IOException {

        try (var fos = new FileOutputStream("persons.txt");
             var bos = new BufferedOutputStream(fos);
             var oos = new ObjectOutputStream(bos)) {

            Person person1 = new Person("Vadim", "qwerty123");
            Person person2 = new Person("Alex", "qwert");

            oos.writeObject(person1);
            oos.writeObject(person2);
        }
    }
}
