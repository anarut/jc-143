package lesson07.animal;

public class GoldFish extends Fish {

    public GoldFish(int age, String name, double weight, boolean male) {
        super(age, name, weight, male);
    }

    @Override
    public void eat() {
        System.out.println("eating grass");
    }
}
