package lesson07.animal;

public abstract class Animal extends Object {

    int age;
    String name;
    double weight;
    boolean male;

//    public Animal() {
//    }

    public Animal(int age, String name, double weight, boolean male) {
//        super();
        this.age = age;
        this.name = name;
        this.weight = weight;
        this.male = male;
    }

    public void breath() {
        System.out.println("... fresh air");
    }

    public void sleep() {
        System.out.println("Zzz Zzz Zzz");
    }

    public abstract void voice();

    public abstract void eat();

}
