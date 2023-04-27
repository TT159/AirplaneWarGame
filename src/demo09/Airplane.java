package demo09;

import javax.swing.ImageIcon;

public class Airplane extends FlyingObject {
	
	public Airplane(double x, double y, double width, 
			double height, double step) { 

		super(x, y, width, height);
		this.step = step; 	
		image = new ImageIcon("images/airplane0.png");// 属性不冲突时，默认为继承于父类的属性
	
		
	}

	// 将这个方法提取到父类中
//	public void move() {
//		y += step;
//	}

}
