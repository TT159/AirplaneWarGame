package demo03;

public class Airplane extends FlyingObject {
	double step;
	
	public Airplane(double x, double y, double width, double height, double step) {
		super(x, y, width, height);
		this.step = step; //只有上面4个参数时所有子类共有的，所以step参数依旧得写在子类里
	}

	public void move() {
		y += step;
	}

}
