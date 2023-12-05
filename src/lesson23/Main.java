package lesson23;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalAdjusters;
import java.time.temporal.TemporalUnit;

public class Main {

    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDate now1 = LocalDate.now();
        LocalTime now2 = LocalTime.now();
        System.out.println(now);
        System.out.println(now1);
        System.out.println(now2);
        Duration duration = Duration.between(LocalTime.now(), LocalTime.now()
                .plusMinutes(-10)
                .minusSeconds(40));
        Period period = Period.between(LocalDate.of(2023, Month.JULY, 21), LocalDate.now());
        System.out.println(duration);
        System.out.println(period);

        String pt15M = "PT15M";

        Duration parse = Duration.parse(pt15M);
        long seconds = parse.getSeconds();
        System.out.println(parse);
        System.out.println(seconds);


        LocalDate date = LocalDate.of(2022, 12, 31);
        System.out.println(date);
        LocalDate nextDate = date.plusDays(123);
        boolean leapYear = nextDate.isLeapYear();
        System.out.println(nextDate);
        LocalDate plus = nextDate.plus(period);
        LocalDate plus1 = nextDate.plus(5, ChronoUnit.WEEKS);
        DayOfWeek dayOfWeek = plus1.getDayOfWeek();
        LocalDate localDate = plus1.withMonth(9);
        System.out.println(localDate);

        LocalDate with = LocalDate.now().with(TemporalAdjusters.firstInMonth(DayOfWeek.SATURDAY));
        System.out.println(with);
        LocalDate with1 = LocalDate.now().with(TemporalAdjusters.lastInMonth(DayOfWeek.SUNDAY));
        System.out.println(with1);

        LocalDate localDate1 = LocalDate.now()
                .with(TemporalAdjusters.firstInMonth(DayOfWeek.SATURDAY))
                .plusWeeks(1);
        LocalDate with2 = LocalDate.now().with(TemporalAdjusters.nextOrSame(DayOfWeek.SATURDAY));


        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        String format = dateTimeFormatter.format(now1);

        LocalDate parse1 = LocalDate.parse(format ,dateTimeFormatter);
        System.out.println(parse1);
        System.out.println(format);
    }
}
