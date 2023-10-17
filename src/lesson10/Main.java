package lesson10;

public class Main {

    public static void main(String[] args) {
        int as12;
        Object classA = new ClassA();
        ClassB classB = new ClassB(3);
        System.out.println("");
        System.out.println("");

        ClassC classC = new ClassC(classB);
        classB.todoB();
        classC.todoB();

        StringBuilder append = new StringBuilder("asjdhaskj")
                .append("asdkjasdsa")
                .append("asdasd");

        System.out.println(append);
        String s = append.toString();
        char[] chars = s.toCharArray();


        char[] chars1 = append.toString().toCharArray();

        int length = append.length();
        char c = append.charAt(1);

        char[] charArray = new char[append.length()];
        append.getChars(0, append.length(), charArray, 0);


    }
}
