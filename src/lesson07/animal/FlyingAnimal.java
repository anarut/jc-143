package lesson07.animal;

public abstract class FlyingAnimal extends Animal {

    boolean feather;

    public FlyingAnimal(int age, String name, double weight, boolean male, boolean feather) {
        super(age, name, weight, male);
        this.feather = feather;
    }

    public void fly() {
        System.out.println("I believe I can fly");
    }

    @Override
    public void eat() {
        System.out.println("eating worms");
    }
}
