package demo02;

public class Sky extends FlyingObject {

	double step;
	
	public Sky(double x, double y, double width, double height, double step) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.step = step;
	}

	public void move() {
		y += step;
	}

	
	
}
