package demo11;

import java.awt.Graphics;
import javax.swing.ImageIcon;

public class FlyingObject {
	protected double x;
	protected double y;
	protected double width;
	protected double height;
	protected double step; 
	protected ImageIcon image; 
	
	public FlyingObject(double x, double y, 
			double width, double height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	/*
	 * 这些方法需要大家都能用，所以都是用的public
	 */
	public void paint(Graphics g) {
		image.paintIcon(null, g, (int)x, (int)y);// 第一个参数不重要。后面x,y可加也可不加this，因为无冲突命名
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
