package prob4;

public class Rectangle extends Shape implements Resizable {

	public Rectangle(double w, double h) {
		super.setHeight(h);
		super.setWidth(w);
	}

	@Override
	public void resize(double s) {
		double resizeHeight = getHeight() * s;
		double resizeWidth = getWidth() * s;
		super.setHeight(resizeHeight);
		super.setWidth(resizeWidth);
	}

	@Override
	double getArea() {
		double result;
		result = getHeight() * getWidth();
		return result;
	}

	@Override
	double getPerimeter() {
		double result;
		result = (getHeight() + getWidth()) * 2;
		return result;
	}

}
