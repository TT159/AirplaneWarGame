package demo03;

public class Bullet extends FlyingObject {
	double step;
	
	public Bullet(double x, double y, double width, double height, double step) {
		super(x, y, width, height);
		this.step = step;
	}
	
	public void move() {
		y -= step;
	}
	
	
}
