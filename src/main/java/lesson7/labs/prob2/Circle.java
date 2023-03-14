package lesson7.labs.prob2;

public final class Circle implements Polygon {
	final private double radius;

	@Override
	public double[] getSides() {
		return new double[]{radius};
	}

	@Override
	public double computePerimeter() {
		return 2 * Math.PI * radius; 
	}
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}
}
