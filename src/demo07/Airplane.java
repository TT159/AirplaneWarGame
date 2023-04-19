package demo07;

import javax.swing.ImageIcon;

public class Airplane extends FlyingObject {

	// ImageIcon image;
	
	public Airplane(double x, double y, double width, 
			double height, double step) { 
		/*
		 * 这里的构造器参数里不需要： ImageIcon image
		 * 原因是这个图片属性，不是需要用户输入的参数，如果写在这里面，
		 * 那么每一次创建对象实例的时候，需要输出image属性对应的值。
		 * 其是默认的属性，有固定的值，不需要用户来设定。
		 * 在父类里定义了image属性，所以就直接继承这个属性并对其初始化即可。
		 */
		super(x, y, width, height);
		this.step = step; 
		/*
		 * 如果一定要在子类里定义一个image属性，那么为了能正常使用父类中的paint方法绘制image，
		 * 那么在构造器这里必须使用super.关键字，对Airplane继承于父类的image属性进行初始化
		 * super.image = new ImageIcon("images/airplane0.png");
		 * 同时为了测试，我们依旧对子类自己的image属性也初始化为bom1图片
		 * 因为这个image不是继承于父类的，因此无法使用父类的paint方法绘制出来，而是得像demo06里那样
		 * 在World文件里， Airplane对象得调用image属性，利用paintIcon方法进行绘制
		 * airplanes[0].image.paintIcon(this, g, 0, 0);// paintIcon是ImageIcon类里的方法
		 * 因此显然是多此一举，我们也不需要两个image属性。直接继承于父类的image属性，在子类里初始化即可
		 */
//		super.image = new ImageIcon("images/airplane0.png");
//		image = new ImageIcon("images/bom1.png");
		
		image = new ImageIcon("images/airplane0.png");// 属性不冲突时，默认为继承于父类的属性
	
		
	}

	// 将这个方法提取到父类中
//	public void move() {
//		y += step;
//	}

}
