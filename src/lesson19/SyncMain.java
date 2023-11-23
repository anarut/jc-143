package lesson19;

public class SyncMain {

    static class Counter {
        int count = 0;

        public int getCount() {
            return count;
        }

        public void inc() {
            count = count + 1;
            // a = count;
            // a = a + 1;
            // count = a;
        }
    }
    public static void main(String[] args) {
        Counter counter = new Counter();
        Runnable r = () -> {
            for (int i = 0; i < 10; i++) {
                synchronized (Counter.class) {
                    extracted(counter);
                }

                try {
                    Thread.sleep(1L);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        for (int i = 0; i < 3; i++) {
            new Thread(r).start();
        }
    }

    private static void extracted(Counter counter) {
        counter.inc();

        try {
            Thread.sleep(1L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("%s --- count: %s"
                .formatted(Thread.currentThread().getName(), counter.getCount()));
    }


}
