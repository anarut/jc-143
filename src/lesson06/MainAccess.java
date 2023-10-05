package lesson06;

public class MainAccess {

    private int a = 1;
    int b = 2;
    protected int c = 3;
    public int d = 4;

    public static void main(String[] args) {
        MainAccess mainAccess = new MainAccess();
        int a = mainAccess.a;
        int b = mainAccess.b;
        int c = mainAccess.c;
        int d = mainAccess.d;
    }
}
