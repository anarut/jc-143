package lesson04;

public class Main03 {

    public static void main(String[] args) {
        int sum = 11;
        for (int i = 0; i < sum; i++) {
            for (int j = i + 1; j < sum - i; j++) {
                int k = sum - i - j;
                if (k > j) {
                    System.out.println(i + " " + j + " " + k);
                }
            }
        }

        System.out.println();
        // i + j + k + m = sum   ;  i,j,k,m >=0
        // k + m = sum - i - j
        for (int i = 0; i < sum; i++) {
            for (int j = i + 1; j < sum - i; j++) {
                for (int k = j + 1; k < sum - i - j; k++) {
                    int m = sum - i - j - k;
                    if (m > k) {
                        System.out.println(i + " " + j + " " + k + " " + m);
                    }
                }
            }
        }
    }
}
