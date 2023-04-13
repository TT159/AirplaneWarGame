package demo01;

public class Sky {
	double x;
	double y;
	double width;
	double height;
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

	@Override
	public String toString() {
		return "Sky [x=" + x + ", y=" + y + ", width=" + width + ", height=" + height + ", step=" + step + "]";
	}
	
	
	
}
