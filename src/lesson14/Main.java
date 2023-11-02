package lesson14;

import lesson07.Point;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        Point point1 = new Point(1, 2);
        Point point2 = new Point(2, 3);
        Point point3 = new Point(3, 5);
        Point point4 = new Point(2, -2);
        Point point5 = new Point(7, 2);


        // x+
        // y+
        // x+ y+
        // y+ x+
        // (x+y)+
        // (x*x + y*y)+
//        Set<Point> set = new TreeSet<>(new PointYComparator().reversed());

        Comparator<Point> pointComparator = new PointXComparator()
                .thenComparing(new PointYComparator());

        Set<Point> set = new TreeSet<>(pointComparator);
        set.add(point1);
        set.add(point2);
        set.add(point3);
        set.add(point4);
        set.add(point5);

        System.out.println(set);

        int i = point1.compareTo(point3);

        boolean b = point1 == point2;
        boolean equals = point1.equals(point2);

        Iterator<Point> iterator = set.iterator();
        while (iterator.hasNext()) {
            Point next = iterator.next();
            System.out.println(next);
        }



        for (Point p : set) {

        }
    }
}
