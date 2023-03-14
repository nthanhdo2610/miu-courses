package lesson7.labs.prob2;

public class EquilateralTriangle implements Polygon {

    private double size;

    @Override
    public double[] getSides() {
        return new double[]{size, size, size};
    }

    public EquilateralTriangle(double size) {
        this.size = size;
    }

    public double getSize() {
        return size;
    }
}
