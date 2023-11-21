package lesson17;

import lesson07.Point;

@FunctionalInterface
public interface PointOp {
    Point create(int a, int b);

//    Point create();
}
