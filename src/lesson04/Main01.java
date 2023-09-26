package lesson04;

public class Main01 {

    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            System.out.printf("5 * %d = %d\n", i, i * 5);
//            System.out.println("5 * " + i + " = " + i * 5);
        }
        System.out.println();
        for (int i = 1; i < 10000; i *= 2) {
            System.out.print(i + " ");

        }

        System.out.println();
        int n = 7;
        int m = 4;
        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();

        for (int j = 0; j < n; j++) {
            for (int i = 0; i <= j; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }


        System.out.println();

        // 1, j = 0
        // 3, j = 1      2j + 1
        // 5, j = 2
        // 7, j = 3
        // 9, j = 4
        // 11, j = 5
        // 13, j = 6

        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n - 1 - j; i++) {
                System.out.print("  ");
            }
            for (int i = 0; i < 2 * j + 1; i++) {
                System.out.print("* ");
            }
            for (int i = 0; i < n - 1 - j; i++) {
                System.out.print("  ");
            }
            System.out.println();
        }
    }
}
