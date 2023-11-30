package lesson21;

public class Consumer implements Runnable {
    private final Store store;
    private final int size;

    private String name;

    public Consumer(Store store, int size) {
        this.store = store;
        this.size = size;
    }

    @Override
    public void run() {
        for (int i = 0; i < size; i++) {
            store.removeItem();
            try {
                Thread.sleep(3000L);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
