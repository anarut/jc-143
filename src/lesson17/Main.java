package lesson17;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.net.URI;
import java.nio.file.Path;

public class Main {

    public static void main(String[] args) {


        File file = new File("test.txt");
        file.renameTo(new File("1/test1.txt"));
        long l = file.lastModified();
        long l1 = System.currentTimeMillis();

//        file.setLastModified(1232312128371289371L);

        //  somedata_202311142039.zip // 30 days
        //  somedata_202311152039.zip
        //  megadata_202311152039.zip // 7 days
        //  megadata_202311152039.zip



        Path path = file.toPath();
        URI uri = file.toURI();
        System.out.println(uri);
        File[] files = file.listFiles();
        String[] list = file.list();


        if (false) {
            System.out.println(file.getAbsolutePath());
            //   /Users/Andrey/projects/it-academy/jc-143/tests/1/case1
            File file1 = new File("tests/1/case1");
            file.isFile();
            file.isDirectory();
            file.isAbsolute();
            File absoluteFile = file.getAbsoluteFile();
            boolean hidden = file.isHidden();
            boolean b = file.canExecute();
            boolean b1 = file.canRead();
            boolean b2 = file.canWrite();
            boolean exists = file.exists();
            boolean mkdir = file.mkdir();
            boolean mkdirs = file.mkdirs();
            try {
                boolean newFile = file.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            long freeSpace = file.getFreeSpace();
        }

        InputStream in = System.in;
        PrintStream out = System.out;
        PrintStream err = System.err;


    }
}
