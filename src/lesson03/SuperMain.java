package lesson03;

public class SuperMain {
    public static void main(String[] args) {
        int a1 = 1;
        a1 = a1 + 2;
        System.out.println(a1);

        int n = -5673845; // n >= 0
        int r = n % 7; //[0; 6]
//        if (r < 0) {
//            r +=7;
//        }
//        int r = (n % 7 + 7) % 7;
        switch (r) {
            case 0, 7, -7:
                System.out.println("чт");
                break;
            case 1, -6:
                System.out.println("пт");
                break;
            case 2, -5:
                System.out.println("сб");
                break;
            case 3, -4:
                System.out.println("вск");
                break;
            case 4, -3:
                System.out.println("пн");
                break;
            case 5, -2:
                System.out.println("вт");
                break;
            case 6:
            case -1:
                System.out.println("ср");
                break;
        }


        if (r == 0) {
            System.out.println("чт");
        } else if (r == 1) {
            System.out.println("пт");
        } else if (r == 2) {
            System.out.println("сб");
        } else if (r == 3) {
            System.out.println("вск");
        }
    }
}
