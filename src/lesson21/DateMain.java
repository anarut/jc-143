package lesson21;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateMain {

    public static void main(String[] args) {
        Date date = new Date(1862342886643L);
        System.out.println(date);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("h:mm a");

        System.out.println(simpleDateFormat.format(date));
    }
}
