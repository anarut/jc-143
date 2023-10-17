package lesson09;

public class Main2 {

    public static void main(String[] args) {
        String s = "asade";
        System.out.println(s.charAt(0));
        System.out.println(s.charAt(s.length() - 1));
        if (s.length() % 2 != 0) {
            System.out.println(s.charAt(s.length() / 2));
        }


        String str = "а роза упала на лапу Азора";
        str = str.toLowerCase();
        str = str.replaceAll(" ", "");

        boolean isPalindrom = true;

        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                isPalindrom = false;
                break;
            }
        }
        if (isPalindrom) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        System.out.println(str);
    }
}
