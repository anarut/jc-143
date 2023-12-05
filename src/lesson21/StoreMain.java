package lesson21;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StoreMain {

    public static void main(String[] args) {
        Store store = new Store(0, 7);
        List<Runnable> runnables = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            Producer producer = new Producer(store);
            runnables.add(producer);
        }

        for (int i = 0; i < 7; i++) {
            runnables.add(new Consumer(store, new Random().nextInt(5, 15)));
        }

        runnables.forEach(r -> new Thread(r).start());
    }

    class Wrapper {
        Integer a;
        String b;

        public Wrapper(Integer a, String b) {
            this.a = a;
            this.b = b;
        }
    }
    public <K> K blabla(K item) {

        Integer a = 1;
        String b = "b";

        new Wrapper(a, b);
        return item;
    }
}
