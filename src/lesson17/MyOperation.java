package lesson17;

public class MyOperation implements Operation {
    @Override
    public int apply(int a, int b) {
        return -a + b;
    }
}
