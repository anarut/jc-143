public class Main {

    static int aStatic;

    public static void main(String[] args) {


        long l = 1234532123123412312L;

//        1456723547623514673546723547236487261478623784621380000

        // \u0041 = A = 4 * 16 + 1 = 65

        char a1 = 65;
        char a2 = 'A';
        char a3 = '\u0041';
        char a4 = '\u0f0f';

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);

        // _$A
        int c = 4343 + 3;

        int ar;
        ar = 44;
        int at = ar + 4;

        byte b1, b2, b3 = 44, b4;

        b4 = 5;

//        byte b5 = b3 - b4;
        b1 = 44 + 5;

        byte byt = 127;
        byt = 12;

        short s = byt;

        byte bb = (byte) s;

        long g = 44;

        int newInt = 127 + 256 * 55;
        System.out.println(newInt);
        System.out.println(Integer.toBinaryString(newInt));
        byte newByte = (byte) newInt;
        System.out.println(newByte);

        byte q1 = 44;
        int q2 =  q1; //  byte (1) -> int (4)
        byte q3 = (byte) q2; // int (4) -> byte (1)

        int bytea = 3;


    }
}
