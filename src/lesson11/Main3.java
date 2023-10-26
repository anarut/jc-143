package lesson11;

public class Main3 {

    public static void main(String[] args) {
        Day monday = Day.MONDAY;
        Day day = Day.valueOf("MONDAY");
        int i = 341324124;
        switch (day) {
            case MONDAY:
                System.out.println("");
                break;
            case THURSDAY:
                System.out.println("");
                break;
            case WEDNESDAY:
                System.out.println("");
                break;
            case TUESDAY:
                System.out.println("");
                break;
            case FRIDAY:
                System.out.println("");
                break;
            case SATURDAY:
                System.out.println("");
                break;
            case SUNDAY:
        }

        Day[] values = Day.values();

        int ordinal = day.ordinal();
        String name = day.name();



        Day.THURSDAY.run();
        Day.FRIDAY.run();
        Day.SUNDAY.run();
    }
}
