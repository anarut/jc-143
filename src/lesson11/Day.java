package lesson11;

import lesson08.Runnable;

public enum Day implements Runnable {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY(),
    FRIDAY(true) {
        @Override
        public void run() {
            System.out.println("TGIF");
        }
    },
    SATURDAY(true),
    SUNDAY(true);

    private boolean weekend;

    Day() {
        this(false);
    }

    Day(boolean weekend) {
        this.weekend = weekend;
    }

    public boolean isWeekend() {
        return weekend;
    }

    @Override
    public void run() {
        System.out.println(values()[(ordinal() + 1) % values().length]);
    }
}
