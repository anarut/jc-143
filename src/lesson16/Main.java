package lesson16;

import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("helpme.txt");
            fos.write("Help me please".getBytes());
            fos.write("\n".getBytes());
            fos.flush();
            fos.write("I'm here".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println("file created!");
    }
}
