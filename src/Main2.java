public class Main2 {

    public static void main(String[] args) {
        int a = 27;
        int b = 7;
        int c = a / b;  // 3
        System.out.println(c);
        System.out.println(a / b * 1.0);
        System.out.println(1.0 * a / b);

        System.out.println(a % b); // [0; 6]

        // a = a % b + a / b * c = 6 + 3 * 7

        System.out.println();
        b = b + 1;
        System.out.println(b); //8

        System.out.println(b++); // 8
        System.out.println(b--); // 9
        System.out.println(++b); // 9
        System.out.println(--b); // 8

        //

        System.out.println(b);
        b = b + 1;

        System.out.println(b);
        b = b - 1;

        b = b + 1;
        System.out.println(b);

        b = b - 1;
        System.out.println(b);


        b = 55;

        b = b + 55;
        b += 55;


        b = b * 4;
        b *= 4;

        System.out.println(Integer.toBinaryString((-88 >> 3)));
    }
}
