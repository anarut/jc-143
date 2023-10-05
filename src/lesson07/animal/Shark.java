package lesson07.animal;

public class Shark extends Fish {

    public Shark(int age, String name, double weight, boolean male) {
        super(age, name, weight, male, false);
    }

    @Override
    public void eat() {
        System.out.println("eating humans");
    }
}
