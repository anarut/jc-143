package lesson21;

import java.io.*;
import java.util.Random;

public class Main {
    public static void main2(String[] args) throws IOException {

//        byte i1 = (byte) i;
//        System.out.println(i1);

//        689
//        885
//        12
//        983
//        959
        try (FileOutputStream fos = new FileOutputStream("numbers.data");
             BufferedOutputStream bos = new BufferedOutputStream(fos);
             var o = new ObjectOutputStream(bos)) {
//            byte[] mas = new byte[quantityNumberMas];
            for (int i = 0; i < 5; i++) {
                int n = new Random().nextInt(0, 1000);
                System.out.println(n);
                o.writeInt(n);
            }

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }


    public static void main(String[] args) throws IOException {

//        byte i1 = (byte) i;
//        System.out.println(i1);

        //835
        //99
        //897
        //74
        //400

//        Integer b = 2222;
//        b.byteValue();


        try (var fos = new FileInputStream("numbers.data");
             var bos = new BufferedInputStream(fos);


             var o2 = new ObjectInputStream(bos)) {
//            byte[] mas = new byte[quantityNumberMas];
            for (int i = 0; i < 15; i++) {
//                int n = new Random().nextInt(0, 1000);
                int read = o2.readInt();
                System.out.println(read);
            }

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
