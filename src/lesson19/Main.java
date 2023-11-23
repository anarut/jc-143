package lesson19;

import java.util.Optional;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        Optional<Integer> reduce =
                Stream.of(7, 5, 6, 8, 8, 9, 11, 2, 3)
//                        .parallel()
                        .filter(i -> i < 100)
                .reduce((a, b) -> {
                    int min = Math.min(a, b);
                    System.out.println("%s %s -> %s".formatted(a, b, min));
                    return min;
                });

        reduce.ifPresent(System.out::println);


        Optional<Integer> reduce1 = Stream.of(7, 5, 6, 8, 8, 9, 11, 2, 3)
                .reduce((a, b) -> a + b);
        Integer reduce2 = Stream.of(7, 5, 6, 8, 8, 9, 11, 2, 3)
                .reduce(0, (a, b) -> a + b);

//        p1 p2 -> p3(x1 +x2, y1+y2)


    }
}
