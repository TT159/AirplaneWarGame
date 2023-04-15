package demo03;

public class Sky extends FlyingObject {

	double step;
	
	public Sky(double x, double y, double width, double height, double step) {
		super(x, y, width, height);
		this.step = step;
	}

	public void move() {
		y += step;
	}

	
	
}
