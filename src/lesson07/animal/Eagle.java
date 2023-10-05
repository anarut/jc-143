package lesson07.animal;

public class Eagle extends FlyingAnimal {

    public Eagle(int age, String name, double weight, boolean male) {
        super(age, name, weight, male, true);
    }

    @Override
    public void voice() {
        System.out.println("yyyyy");
    }
}
