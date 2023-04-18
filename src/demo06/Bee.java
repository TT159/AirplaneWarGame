package demo06;

import javax.swing.ImageIcon;

public class Bee extends FlyingObject {
	
	// 构造器
	public Bee(double x, double y, double width,
			double height, double step) {
		super(x, y, width, height); // 父类构造器赋值
		this.step = step; // 在自己子类中赋值
		this.image = new ImageIcon("images/bee0.png");
	}
	
	/*
	 * 在extendsDemo/DemosuperDot里有详细展示。重写（拓展）父类方法，
	 * 在父类方法的基础上加上自己当前类的独特逻辑。
	 */
	public void move() {
		super.move();
		x++;
	}
	

}
