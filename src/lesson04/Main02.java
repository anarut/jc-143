package lesson04;

public class Main02 {

    public static void main(String[] args) {
        int k = 5;
        int r = 1;
        for (int i = 1; i <= k; i++) {
            r = r * i;
        }

        System.out.println(r);

        System.out.println(factorio(6));


        int a = 0;
        int b = 1;
        System.out.println(a);
        System.out.println(b);
        for(int i = 0; i<5; i++){
            int j = a + b;
            a = b;
            b = j;
            System.out.println(j);
        }
    }

    // 5! = 1 * 2 * 3 * 4 * 5
    // n! = 1 * 2 * 3 * ... * (n - 1) * n    n > 0
    // 0! = 1
    // 1! = 1
    // 2! = 1 * 2 = 2
    // 3! = 2! * 3 = 6
    // (n + 1)! = n! * (n + 1)
    // n! =  (n - 1)! * n

    public static int factorio(int n) {
        if (n == 1 || n == 0) {
            return 1;
        } else {
            return factorio(n - 1 ) * n;
        }
    }
}
