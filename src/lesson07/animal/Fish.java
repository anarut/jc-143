package lesson07.animal;

public abstract class Fish extends Animal {

    boolean scale;

    public Fish(int age, String name, double weight, boolean male) {
       this(age, name, weight, male, true);
    }

    public Fish(int age, String name, double weight, boolean male, boolean scale) {
        super(age, name, weight, male);
        this.scale = scale;
    }

//    public Fish() {
//        super(14, "saa", 2, true);
//    }

    public void swim() {
        System.out.println("I can swim");
    }

    @Override
    public void voice() {
        System.out.println("bul bul bul");
    }

    @Override
    public void breath() {
        if (scale) {
            System.out.println("under water no air");
        } else {
//            Animal animal = super;
            super.breath();
//            this.breath();
//            breath();
//            Fish fish = this;
//            System.out.println("... fresh air");
        }
    }
}
