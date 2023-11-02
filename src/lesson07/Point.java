package lesson07;

public class Point implements Comparable<Point> {

    private int x;
    private int y;

    public Point(double jkgasdfjkasdfjkhasdf, double sdjkhjkhasdfjkasfy) {
        x = (int) jkgasdfjkasdfjkhasdf;
        this.y = (int) sdjkhjkhasdfjkasfy;
    }

    public Point() {
        this(0,0);
    }

    public Point(int x, int y) {
//        super();
        this.x = x;
        this.y = y;
        System.out.println("point created");
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ')';
    }

    @Override
    public int compareTo(Point o) {
        int length1 = this.x * this.x + this.y * this.y;
        int length2 = o.x * o.x + o.y * o.y;
        if (length1 > length2) {
            return 1;
        } else if (length1 == length2) {
            return 0;
        } else {
            return -1;
        }
    }


    // (1,1)
    // (1,1,1)
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof Point)) return false;
//
//        Point point = (Point) o;
//
//        if (getX() != point.getX()) return false;
//        return getY() == point.getY();
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Point)) return false;
        Point point = (Point) o;
        return getX() == point.getX() && getY() == point.getY();
    }

    @Override
    public int hashCode() {
        int result = getX();
        result = 31 * result + getY();
        return result;
    }
}
