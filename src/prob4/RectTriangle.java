package prob4;

public class RectTriangle extends Shape {
	public RectTriangle(double w, double h) {
		super.setHeight(h);
		super.setWidth(w);
	}

	@Override
	double getArea() {
		double result;
		result = getWidth() * getHeight() / 2;
		return result;
	}

	@Override
	double getPerimeter() {
		double result;
		result = getWidth() + getHeight() + Math.sqrt(Math.pow(getHeight(), 2) + Math.pow(getWidth(), 2));
		return result;
	}
}
