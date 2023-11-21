package lesson18;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        Function<String, Integer> f = str -> str.length();

        System.out.println(f.apply("hello"));


        int pageSize = 30;
        int page = 14;


        Stream.of(1,2,3)
                .skip((page - 1) * pageSize)
                .limit(pageSize);

        //(a,b,c) -> d

        // string[] -> char[]
//        Stream<String> abc = Stream.of("africa", "america");

//        //    2     ->  2 [6]  [7] -> 13
//        // string[] -> char[][]
//        Stream<Integer> integerStream = abc.map(s -> {
//            return s.length();
//        });
//
//        // 1 map() -> 1
//        // x map() -> x
//        Stream<char[]> stream = abc.map(s -> {
//            return s.toCharArray();
//        });
//
//        Stream<byte[]> stream1 = abc.map(s -> s.getBytes());
//
//        Stream<Boolean> a = abc.map(s -> s.contains("a"));
//        IntStream intStream = abc.mapToInt(s -> s.hashCode());

        Stream.of("africa", "america")
                .map(str -> str.toCharArray())
                        .forEach(arr -> System.out.println(Arrays.toString(arr)));

        System.out.println("------------");
        // 1 -> 0, 1, 2 ...
        Stream.of("africa", "america")
                .flatMapToInt(s -> s.chars())
                .forEach(integer -> System.out.println((char)integer));
        System.out.println("------------");
        Stream.of("a", "", "", "")
                .map(str -> str.toCharArray())
                .forEach(arr -> System.out.println(Arrays.toString(arr)));

        System.out.println("------------");
        Stream.of("a", "", "", "")
                .flatMapToInt(s -> s.chars())
                .forEach(integer -> System.out.println((char)integer));
        System.out.println("------------");


        List<Integer> list = Stream.of("africa", "america")
                .flatMapToInt(String::chars)
                .boxed()
                .collect(Collectors.toList());

        Map<Character, Integer> collect = Stream.of("afric", "me")
                .flatMapToInt(String::chars)
                .boxed()
                .collect(Collectors.toMap(i -> (char)((int) i), Function.identity()));


        Map<Character, Long> longMap = Stream.of("africa", "america")
                .flatMapToInt(String::chars)
                .boxed()
                .collect(Collectors.groupingBy(i -> (char) ((int) i),
                        Collectors.counting()));

        System.out.println(longMap);

        long count = Stream.of("africa", "america")
                .flatMapToInt(String::chars)
                .distinct()
                .count();

        System.out.println(count);


//        https://habr.com/ru/articles/445622/
        List<List<String>> result = Stream.of("Devoxx", "Voxxed Days", "Code One", "Basel One",
                        "Angular Connect")
                .collect(Collectors.teeing(
                        // первый коллектор
                        Collectors.filtering(n -> n.contains("xx"), Collectors.toList()),
                        // второй коллектор
                        Collectors.filtering(n -> n.endsWith("One"), Collectors.toList()),
                        // слияние - автоматический вывод типа здесь не работает
                        (List<String> list1, List<String> list2) -> List.of(list1, list2)
                ));
        System.out.println(result); // -> [[Devoxx, Voxxed Days], [Code One, Basel One]]


        Optional<Integer> max = Stream.of("africa", "america")
                .flatMapToInt(String::chars)
                .boxed()
                .max(Comparator.reverseOrder());


        boolean b = Stream.of("africa", "america")
                .flatMapToInt(String::chars)
                .boxed()
//                .filter(i -> i > 0)
//                .count() == 0;
                .noneMatch(i -> i > 0);


        List<?> a = new ArrayList<>();

//        @SuppressWarnings("unchecked")
        List<Integer> a1 = (List<Integer>) a;

        Optional<Integer> any = Stream.of("africa", "america")
//                .parallel()
                .flatMapToInt(String::chars)
                .filter(value -> value == -5)
                .boxed()
                .findAny();


        Integer i = Stream.of("africa", "america")
//                .parallel()
                .flatMapToInt(String::chars)
                .filter(value -> value == -5)
                .boxed()
                .findAny()
                .orElse(new Random().nextInt());


        Integer i2 = Stream.of("africa", "america")
//                .parallel()
                .flatMapToInt(String::chars)
                .filter(value -> value == -5)
                .boxed()
                .findAny()
                .orElseGet(() -> new Random().nextInt());
    }

}
