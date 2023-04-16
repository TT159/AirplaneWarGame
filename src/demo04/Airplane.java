package demo04;

public class Airplane extends FlyingObject {
//	double step;
	/*
	 * 这个step属性值得注意，一开始没有将其泛化提取到父类中，是因为Hero子类没有这个属性，所以不能提取。
	 * 现在因为需要将子类中的move()方法提取到父类，父类需要step属性，因此在父类里加上了step属性
	 * 显然不能在父类中利用构造器对step赋值，因为Hero对象都没有这个属性，因此其赋值语句依旧在子类中
	 * 保持了每个子类的独特属性
	 */
	
	public Airplane(double x, double y, double width, double height, double step) {
		super(x, y, width, height);
		this.step = step; 
	}

	// 将这个方法提取到父类中
//	public void move() {
//		y += step;
//	}

}
