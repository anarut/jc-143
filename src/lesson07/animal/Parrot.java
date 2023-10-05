package lesson07.animal;

public class Parrot extends FlyingAnimal {

    public Parrot(int age, String name, double weight, boolean male) {
        super(age, name, weight, male, true);
    }

    @Override
    public void voice() {
        System.out.println(" I can speak like a human");
    }
}
