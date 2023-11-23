package lesson19;

public class ThreadUtil {

    public static void printTreadInfo(Thread thread) {
        printTreadInfo(thread, Thread.currentThread().equals(thread));
    }
    public static void printTreadInfo(Thread thread, boolean currentThread) {
        System.out.println(
                """
                -------------------------------
                Thread name: %s   Group: %s %s
                priority: %s, alive: %s
                daemon: %s
                -------------------------------      
                """.formatted(thread.getName(), thread.getThreadGroup().getName(),
                        currentThread ? "(CURRENT)" : "",
                        thread.getPriority(), thread.isAlive(),
                        thread.isDaemon())
        );
    }
}
