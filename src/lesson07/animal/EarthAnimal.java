package lesson07.animal;

import lesson08.Runnable;

public abstract class EarthAnimal extends Animal implements Runnable {

    public EarthAnimal(int age, String name, double weight, boolean male) {
        super(age, name, weight, male);
    }

    public abstract void walk();

    public abstract void run();
}
