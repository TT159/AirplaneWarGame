package demo01;

public class Hero {
	double x;
	double y;
	double width;
	double height;
	
	public Hero(double x, double y, double width, double height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	/**
	 * move the hero plane to (x, y) location
	 * @param x
	 * @param y
	 */
	public void move(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "Hero [x=" + x + ", y=" + y + ", width=" + width + ", height=" + height + "]";
	}
	
	
}
