package lesson07;

public class Point extends Object {

    int x;
    int y;

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

    @Override
    public String toString() {
        return "(" + x + "," + y + ')';
    }
}
