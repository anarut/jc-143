package lesson21;

public class Store {

    public static final int DEFAULT_MAX_COUNT = 5;
    public static final int DEFAULT_START_VALUE = 0;
    private int currentCount;
    private int maxCount;

    public Store() {
        this(DEFAULT_START_VALUE, DEFAULT_MAX_COUNT);
    }

    public Store(int currentCount, int maxCount) {
        if (currentCount < 0 || currentCount > maxCount || maxCount < 1) {
            throw new IllegalArgumentException();
        }
        this.currentCount = currentCount;
        this.maxCount = maxCount;
    }

    public synchronized void addItem() {
        while (currentCount == maxCount) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        currentCount++;
        System.out.println("Item added. store size: %s".formatted(currentCount));
        notifyAll();
    }

    public synchronized void removeItem() {
        while (currentCount == 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        currentCount--;
        System.out.println("Item removed. store size: %s".formatted(currentCount));
        notifyAll();
    }
}
