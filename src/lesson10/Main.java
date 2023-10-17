package lesson10;

public class Main {

    public static void main(String[] args) {
        ClassA classA = new ClassA();
        ClassB classB = new ClassB(3);
        System.out.println("");
        System.out.println("");

        ClassC classC = new ClassC(classB);
        classB.todoB();
        classC.todoB();

    }
}
