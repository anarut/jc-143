package lesson14;

import lesson07.Point;

import java.util.Comparator;

public class PointXYComparator implements Comparator<Point> {
    @Override
    public int compare(Point o1, Point o2) {
        int compare = Integer.compare(o1.getX(), o2.getX());
        if (compare == 0) {
            return Integer.compare(o1.getY(), o2.getY());
        } else {
            return compare;
        }
    }
}
