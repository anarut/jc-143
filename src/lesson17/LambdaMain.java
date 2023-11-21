package lesson17;

import lesson07.Point;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class LambdaMain {

    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        Operation sum = new Operation() {
            @Override
            public int apply(int a, int b) {
                return a + b;
            }
        };

        int c = a + b;
        int apply = sum.apply(a, b);
        Operation multiply = new Operation() {
            @Override
            public int apply(int a, int b) {
                return a * b;
            }
        };


        MyOperation op = new MyOperation();


        int apply1 = multiply.apply(11, 3);
        int apply2 = op.apply(4, 6);




        Operation sum1 = new Operation() {
            @Override
            public int apply(int a, int b) {
                return a + b;
            }
        };

        Operation sum2 = (a1, b1) -> {
            System.out.println(a1);
            return a1 + b1;
        };

        Operation sum3 = (a1, b1) -> a1 + b1;

        Operation sum4 = Integer::sum;
        Operation max = Integer::max;
        Operation max2 = Math::max;
        int max1 = Math.max(a, b);

        int apply3 = sum3.apply(5, 6);

        VoidOp vp = f -> new Point(f,f);

        PointOp newP = (a1, b1) -> {
            if (a1 > 0 && b1 > 0) {
                return new Point(a1, b1);
            } else {
                return new Point(-a1, -b1);
            }
        };

        PointOp newP2 = (x, y) -> new Point(x, y);
        PointOp newP1 = Point::new;


        Point point = newP1.create(6, 7);
        Point point1 = newP1.create(7, 3);


        List<String> list = Arrays.asList("Cat", "Dog", "Turtle", "Parrot", "Fox");

        Stream<String> stream = list.stream();
        Stream<Integer> integerStream = stream.map(name -> name.length());
        integerStream.forEach(nums -> System.out.println(nums));


        int sum5 = list.stream()
                .mapToInt(name -> name.length())
                .sum();

        System.out.println(sum5);
    }
}
