package lesson10;

public class ClassC extends ClassA {

    private ClassB classB;

    public ClassC(int b) {
        this.classB = new ClassB(b);
    }

    public ClassC(ClassB classB) {
        this.classB = classB;
    }

    //DRY
    public void todoB() {
        classB.todoB();
    }
}
