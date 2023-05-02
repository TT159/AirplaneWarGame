package demo11;

import java.awt.Graphics;

import javax.swing.ImageIcon;

public class Sky extends FlyingObject {
	/*
	 * 这个y0显然是Sky类自己独有的属性，所以我们把它封装起来，利用private修饰词
	 */
	private double y0;
	
	public Sky(double x, double y, double width, double height, double step) {
		super(x, y, width, height);
		this.step = step;
		this.image = new ImageIcon("images/background.png"); 
		
		y = 0;// 第一张图片
		y0 = -image.getIconHeight();
		/*
		 * 这里出现了参数冗余的问题，当前子类并没有自己的width和height属性。
		 * 但是其在下面代码里对width和height重新赋值了。
		 * 父类的那个height和width已经在super(x, y, width, height);这里赋值了，即用户输入的值
		 * 下面两行代码仅仅将当前构造器中局部变量的height,width属性重新赋值为输入图片的宽高
		 * 在下面的move()方法中不起作用，move方法中获得的依旧是父类中的height,width
		 * 所以下面两行代码没有起到该起的作用。如果用户输入的宽高不符合要求，则依旧出现拖尾问题
		 * 如Demo01，World对sky的测试里，如果将height设置为1000，则会出bug
		 */
		height = image.getIconHeight(); //自动获取输入图片的高度，700
		width = image.getIconWidth(); //获取宽度， 420
		
		/*
		 * 打桩语句，来单独测试Sky，看是否有bug
		 */
		System.out.println("y=" + y + " y0=" + y0 + " width=" + width + " height=" + height);
	}
	
	// 现在是两张图片交替滚动了，所以重写继承于父类的move方法
	public void move() {
		y += step;
		y0 += step;
		
		// 滚动，出界判断。这个height是继承于父类的height。
		if (y >= height) {
			System.out.println("第一张照片返回： y=" + y);
			y = -height;
			System.out.println("y=" + y + " y0=" + y0 + " width=" + width + " height=" + height);
		}
		if (y0 >= this.height) {
			System.out.println("第二张照片返回： y0=" + y0);
			y0 = -height;
			System.out.println("y=" + y + " y0=" + y0 + " width=" + width + " height=" + height);
		}
	}
	
	// 重写父类中的paint方法，父类中只绘制一张图片，现在需要绘制两张图片了
	public void paint(Graphics g) {
		image.paintIcon(null, g, (int)x, (int)y);
		image.paintIcon(null, g, (int)x, (int)y0);
	}


	
	
}
