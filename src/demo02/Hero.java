package demo02;

public class Hero extends FlyingObject {
	
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
	
}
