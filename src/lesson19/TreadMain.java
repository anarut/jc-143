package lesson19;

public class TreadMain {

    public static void main(String[] args) {
        Thread thread = Thread.currentThread();
        String name = thread.getName();
        long id = thread.getId();
        int priority = thread.getPriority();
        Thread.State state = thread.getState();
        boolean alive = thread.isAlive();
        boolean interrupted = thread.isInterrupted();
        thread.interrupt();
        boolean daemon = thread.isDaemon();


        ThreadGroup threadGroup = thread.getThreadGroup();
        threadGroup.getName();
        threadGroup.activeGroupCount();
        threadGroup.activeCount();
        ThreadGroup parent = threadGroup.getParent();

        System.out.println();


        ThreadUtil.printTreadInfo(thread);

    }
}
