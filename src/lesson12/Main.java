package lesson12;

import lesson07.Point;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
//        Deque<Object> objects1 = new ArrayDeque<>();
//        Queue<Object> objects2 = new ArrayDeque<>();
//        Collection<Object> objects3 = new ArrayDeque<>();
//        Iterable<Object> objects4 = new ArrayDeque<>();

//        Queue<String> cities = new ArrayDeque<>();
        Queue<String> cities = new LinkedList<>();
        cities.add("Minsk");
        cities.offer("Oslo");
        cities.add("Milan");

        System.out.println(cities);
        cities.add("Berlin");
        String poll = cities.poll();
        System.out.println(poll);
        System.out.println(cities);
        System.out.println(cities.size());

        Deque<String> newCities = (Deque<String>)cities;
        newCities.offer("Paris");
        newCities.push("Sydney");
        System.out.println(cities);


//        List<Point> points = new ArrayList<>();
        List<Point> points = new LinkedList<>();
        points.add(new Point(0,2));
        points.add(0, new Point(4,4));
        points.add(new Point(3,2));
        System.out.println(points);
        points.add(3, new Point(0, -2));
        System.out.println(points);
        System.out.println(points.get(3));
    }
}
