package lesson16;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main3 {

    public static void main(String[] args) throws IOException {
        String fileName = "readme.md";
        FileWriter fileWriter = new FileWriter(fileName, true);

        try (var fw = fileWriter;
             var bw = new BufferedWriter(fw)) {
            bw.write("Hello world");
            bw.newLine();
            bw.write("Hello students");
            bw.newLine();
            bw.flush();
            bw.write("Hello guys".toCharArray());
            bw.newLine();
            bw.write("Hello girls");
            bw.newLine();
        }


        try (FileReader fr = new FileReader(fileName);
             BufferedReader br = new BufferedReader(fr)){
            String s = br.readLine();
            while (s != null) {
                System.out.println(s);
                s = br.readLine();
            }


        }

    }
}
