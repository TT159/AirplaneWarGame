package demo03;
/*
 * 通过将子类中的构造器内公共部分，“泛化”抽取到一个父类中
 */

public class FlyingObject {
	double x;
	double y;
	double width;
	double height;
	
	// 在父类中定义构造器，以此来简化子类中的代码
	public FlyingObject(double x, double y, 
			double width, double height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	
	@Override
	public String toString() {
		String className = getClass().getName(); //这是一个API
		return className + " [x=" + x + ", y=" + y + ", width=" + width + ", height=" + height + "]";
	}
	
	
}
