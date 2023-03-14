package lesson7.labs.prob2;

public class Ellipse implements Polygon {

    private double sizeA;
    private double sizeE;

    public Ellipse(double sizeA, double sizeE) {
        this.sizeA = sizeA;
        this.sizeE = sizeE;
    }

    @Override
    public double[] getSides() {
        return new double[]{sizeA, sizeE};
    }

    @Override
    public double computePerimeter() {
        return 4 * sizeA * sizeE;
    }

    public double getSizeA() {
        return sizeA;
    }

    public double getSizeE() {
        return sizeE;
    }
}
