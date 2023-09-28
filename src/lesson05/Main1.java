package lesson05;

import java.util.Arrays;
import java.util.Random;

public class Main1 {

    public static void main(String[] args) {
        int n = 10;
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            // 0 - 99
            arr[i] = new Random().nextInt(-50, 101);
        }
        System.out.println(Arrays.toString(arr));
        // min element
        int min = arr[0];
        for (int el : arr) {
            if (el < min) {
                min = el;
            }
        }
        System.out.println(min);

        // Найти максимальный из элементов массива с четными индексами.

        int result = arr[0];
        //for (int fon : arr){
        for (int i = 0; i < arr.length; i++) {  // i+=2
            if (arr[i] > result && i % 2 == 0) {
                result = arr[i];
            }
        }
        System.out.println(result);

        //Разложить положительные и отрицательные числа по разным массивам.
        int pos_length = 0;
        int neg_length = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                pos_length++;
            } else neg_length++;

        }
        System.out.println(pos_length);
        System.out.println(neg_length);

        int[] pos_arr = new int[pos_length];
        int[] neg_arr = new int[neg_length];

        for (int i = 0, a = 0, b = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                pos_arr[a] = arr[i];
                a++;
            } else {
                neg_arr[b] = arr[i];
                b++;
            }


        }
        System.out.println(Arrays.toString(pos_arr));
        System.out.println(Arrays.toString(neg_arr));

    }
}
