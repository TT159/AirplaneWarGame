package demo04;

public class Bullet extends FlyingObject {
//	double step;
	
	public Bullet(double x, double y, double width, double height, double step) {
		super(x, y, width, height);
		this.step = step;
	}
	
	/*
	 *  方法的重写。重写继承于父类的move方法，作用就是修改了父类的move行为
	 *  父类是向下运动，修改为向上运动
	 */
	public void move() {
		y -= step;
	}
	
	
}
