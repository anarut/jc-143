package lesson08;

public class Robot implements Runnable {

    public Robot() {
    }

    public void voice() {
        System.out.println("destroy humans");
    }

    public void eat() {
        System.out.println("where is my oil");
    }

    public void walk() {
        System.out.println("slow mode on");
    }

    @Override
    public void run() {
        System.out.println("nascar racer");
    }

    public void fly() {
        System.out.println("fly into the space");
    }

    public void fly2() {
        System.out.println("fly into the sky");
    }
}
