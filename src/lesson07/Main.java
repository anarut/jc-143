package lesson07;

public class Main {

    public static void main(String[] args) {
        Point point = new Point(1, 1);

//        Main main = new Main();
        System.out.println(point.getX() + " " + point.getY());

        Line line = new Line(point, new Point(4, 5));
        Line line2 = new Line(point, new Point(10, 12));

        System.out.println(point);
        System.out.println(line);
        System.out.println(line2);

        point.setX(2);
        line.startPoint = new Point(1, 1);

        System.out.println(point);
        System.out.println(line);
        System.out.println(line2);


        Point point1 = new Point(4, 6);

        System.out.println(line.length());
        System.out.println(line2.length());

//        line.getClass();
//        line.hashCode();
//        line.notify();
    }
}
