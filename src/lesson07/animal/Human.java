package lesson07.animal;

public class Human extends EarthAnimal {

    public Human(int age, String name, double weight, boolean male) {
        super(age, name, weight, male);
    }

    @Override
    public void voice() {
        System.out.println("hello world");
    }

    @Override
    public void eat() {
        System.out.println("spagetti");
    }

    @Override
    public void walk() {
        System.out.println("going home");
    }

    @Override
    public void run() {
        System.out.println("running to work");
    }
}
