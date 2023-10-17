package lesson09;

public class Main3 {

    public static void main(String[] args) {
        int n = 250000;
        String s = "";
        long start = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            s = s + i;
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);

        StringBuilder builder = new StringBuilder();
        start = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            builder.append(i);
        }
        end = System.currentTimeMillis();
        System.out.println(end - start);
        builder.append("s");

        String s1 = builder.toString();

        StringBuffer buffer = new StringBuffer();
        start = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            buffer.append(i);
        }
        end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
