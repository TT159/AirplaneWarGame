package demo02;
/*
 * 通过将子类中的共有属性和方法“泛化”抽取到一个父类中
 * 父类中定义从子类中抽取的方法与属性，这种抽取方式被称为泛化
 */

public class FlyingObject {
	double x;
	double y;
	double width;
	double height;
	
	@Override
	public String toString() {
		// return "FlyingObject [x=" + x + ", y=" + y + ", width=" + width + ", height=" + height + "]"; // 默认的toString语句
		
		/*
		 * 让toString方法在父类中得到当前类名
		 */
		String className = getClass().getName(); //这是一个API
		return className + " [x=" + x + ", y=" + y + ", width=" + width + ", height=" + height + "]";
	}
	
	
}
