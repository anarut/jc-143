package lesson07.animal;

public class Cat extends EarthAnimal {

    public Cat(int age, String name, double weight, boolean male) {
        super(age, name, weight, male);
    }

    @Override
    public void voice() {
        System.out.println("meow meow");
    }

    @Override
    public void eat() {
        System.out.println("eating wiskas");
    }

    @Override
    public void walk() {
        System.out.println("boring");
    }

    @Override
    public void run() {
        System.out.println("I like chasing");
    }
}
