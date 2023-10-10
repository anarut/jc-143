package lesson07.animal;

public abstract class Animal {

    private int age;
    private String name;
    private double weight;
    private boolean male;

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            //error
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isMale() {
        return male;
    }

    public void setMale(boolean male) {
        this.male = male;
    }
}
