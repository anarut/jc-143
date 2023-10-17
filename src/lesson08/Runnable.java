package lesson08;

public interface Runnable {

    void run();

    default void stop() {
        System.out.println("stop");
    };
}
