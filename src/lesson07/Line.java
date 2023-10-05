package lesson07;

public class Line {

    Point startPoint;
    Point endPoint;

    public Line(Point startPoint, Point endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    public Line() {
        this(new Point(), new Point());
    }

    public double length() {
        int a = endPoint.x - startPoint.x;
        int b = endPoint.y - startPoint.y;
        return Math.sqrt(a * a + b * b);
    }


    @Override
    public String toString() {
        return "{" + startPoint + " -> " + endPoint + '}';
    }
}
