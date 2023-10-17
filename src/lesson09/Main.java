package lesson09;

public class Main {

    public static void main(String[] args) {
        String s = "hello world";
        String helloWorld = new String("hello world");
        String hello = "hello world";
        String helloWorld2 = new String("hello world");
        char[] chars = {'h', 'i'};
        String s1 = new String(chars);

        System.out.println(s);
        System.out.println(helloWorld);
        System.out.println(s1);

        System.out.println(s == helloWorld);
        System.out.println(s == hello);
        System.out.println(helloWorld == helloWorld2);

        helloWorld = helloWorld.intern();
        String helloWorld3 = helloWorld2.intern();

        System.out.println(s == helloWorld);
        System.out.println(s == hello);
        System.out.println(helloWorld == helloWorld2);
        System.out.println(helloWorld2 == helloWorld3);
        System.out.println(helloWorld3 == hello);

        String abc = "abc".concat("abc");
        String s2 = "abc" + "abc";
        String join = String.join(" + ", "abc", "xyz", "abc");
        System.out.println(join);
        String abcdef = "abcdef";
        char c = abcdef.charAt(4);

        boolean equals = helloWorld.equalsIgnoreCase(helloWorld2);

        System.out.println();
        System.out.println(abcdef);
        System.out.println(abcdef.toUpperCase());
        String substring = "sssssss".substring(4,6);
        System.out.println(substring);
    }
}
