package demo04;
/*
 * 通过将子类中的构造器内公共部分，“泛化”抽取到一个父类中
 */

public class FlyingObject {
	double x;
	double y;
	double width;
	double height;
	double step; // move()方法需要step属性，因此添加在父类中，但是不再父类中赋值(构造器里没有它)
	
	public FlyingObject(double x, double y, 
			double width, double height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	// 在父类中定义move()方法，来提取子类中共有的move()方法
	// 但是Bullet和Hero里的move方法是独特的，那么就在子类里重写方法
	public void move() {
		y += step;
	}
	
	@Override
	public String toString() {
		String className = getClass().getName();
		return className + " [x=" + x + ", y=" + y + ", width=" + width + ", height=" + height + "]";
	}
	
	
}
