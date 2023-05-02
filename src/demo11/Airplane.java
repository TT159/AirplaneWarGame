package demo11;

import javax.swing.ImageIcon;

public class Airplane extends FlyingObject {
	/*
	 * 都是从父类继承过来的属性，所以不需要再加修饰词，其在父类那已经加了修饰词了
	 */
	public Airplane(double x, double y, double width, 
			double height, double step) { 
		
		super(x, y, width, height);
		this.step = step; 	
		image = new ImageIcon("images/airplane0.png");// 属性不冲突时，默认为继承于父类的属性
	
		
	}
}
