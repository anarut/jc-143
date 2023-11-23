package lesson19;

import java.util.Random;

public class Thread2Main {

    public static void main(String[] args) {
        Runnable r = () -> {
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println("hi 2");
            ThreadUtil.printTreadInfo(Thread.currentThread());
        };

        Thread currentThread = Thread.currentThread();
        ThreadUtil.printTreadInfo(currentThread);
        Thread thread1 = new Thread(() -> {
            System.out.println("hi 1");
            try {
                Thread.sleep(3000L);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            ThreadUtil.printTreadInfo(Thread.currentThread());
            System.out.println("end 1");
        });
        thread1.setPriority(7);
        thread1.setDaemon(true);
        ThreadUtil.printTreadInfo(thread1, false);
        thread1.start();


        Thread thread2 = new Thread(r);
        ThreadUtil.printTreadInfo(thread2);
        thread2.setDaemon(true);
        thread2.start();

        Thread thread3 = new Thread(() -> {
            Random random = new Random();
            int sum = 0;
            for (int i = 0; i < 100; i++) {
                sum += random.nextInt();
            }

            System.out.println("sum = " + sum + " " + Thread.currentThread().getName());
        });
//        ThreadUtil.printTreadInfo(thread3);
//        thread3.setDaemon(true);
        thread3.run();
        thread3.start();
    }
}
