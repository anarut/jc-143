package lesson20;

import lesson07.Point;

import java.util.Objects;
import java.util.Random;
import java.util.Vector;
import java.util.concurrent.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    volatile int a;
    public static void main(String[] args) {

//        Pair<String,Integer> pair = new Pair<String,Integer>();
//        String f = pair.first();
//        Integer l = pair.last();
//        Pair<Integer,String> pair2 = pair.swap();
//        Pair<Long,Integer> pair3 = pair.replaceFirst(Long v);\

//        A a = new A();
//        String info = a.read("test/file.txt");
//        B b = new B(info);
//        int count1 = b.calculateWords();
//        int count2 = b.calculateSigns();


        Vector<Object> objects = new Vector<>();


        Point p1 = new Point(1, 1);
        Point p2 = null;

//        Point p3 = sum(p1, p2);


        ExecutorService executorService = Executors.newFixedThreadPool(10);
        ExecutorService executorService1 = Executors.newSingleThreadExecutor();
        ExecutorService threadPoolExecutor = new ThreadPoolExecutor(3, 10, 30L, TimeUnit.MINUTES, new LinkedBlockingQueue<Runnable>());
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(2);


        Runnable r = () -> {
            try {
                Thread.sleep(2000L);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName());
        };

        for (int i = 0; i < 10; i++) {
//            executorService.submit(r);
        }

//        scheduledExecutorService.schedule(r, 10, TimeUnit.SECONDS);





        Future<Integer> future = executorService.submit(() -> {
            try {
                Thread.sleep(5000L);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return new Random().nextInt(100);
        });


        try {
            future.get(3, TimeUnit.SECONDS);
            future.isDone();
            future.isCancelled();
            future.cancel(true);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


        executorService.shutdown();
    }


    public static Point sum(Point a, Point b) {
        Objects.requireNonNull(a);
        Objects.requireNonNull(b, "second parameter is null");
        //
        //
        //
        //
        //
        return new Point(a.getX()+ b.getX(), a.getY() + b.getY());
    }
}
