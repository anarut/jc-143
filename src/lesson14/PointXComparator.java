package lesson14;

import lesson07.Point;

import java.util.Comparator;

public class PointXComparator implements Comparator<Point> {

    @Override
    public int compare(Point o1, Point o2) {
//        return o1.getX() > o2.getX() ? 1 : o1.getX() == o2.getX() ? 0 : -1;
        return Integer.compare(o1.getX(), o2.getX());
    }
}
