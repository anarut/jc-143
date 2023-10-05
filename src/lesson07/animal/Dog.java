package lesson07.animal;

public class Dog extends EarthAnimal {

    public Dog(int age, String name, double weight, boolean male) {
        super(age, name, weight, male);
    }

    @Override
    public void voice() {
        System.out.println("bark");
    }

    @Override
    public void eat() {
        System.out.println("like socks");
    }

    @Override
    public void walk() {
        System.out.println("with human?");
    }

    @Override
    public void run() {
        System.out.println("I love running");
    }
}
