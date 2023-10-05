package lesson07.animal;

public abstract class EarthAnimal extends Animal {

    public EarthAnimal(int age, String name, double weight, boolean male) {
        super(age, name, weight, male);
    }

    public abstract void walk();

    public abstract void run();
}
