package lesson11;

public class InnerClasses {

    int a = 5;
    static int b;

    static class StaticClass {

        public void todo() {
//            System.out.println(a);
            System.out.println(b);
        }
    }

    class NonStaticClass {
        public void todo() {
            System.out.println(a);
            System.out.println(b);
        }
    }

    public void todo() {
        System.out.print("2 + 2");
    }
}

class Second {

}