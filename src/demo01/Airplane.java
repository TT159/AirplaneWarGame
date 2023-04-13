package demo01;

public class Airplane {
	double x, y, width, height;
	double step;
	
	// 鼠标右键 -> source -> generate constructor using fields来自动生成构造器
	public Airplane(double x, double y, double width, double height, double step) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.step = step;
	}

	public void move() {
		y += step;
	}

	// 鼠标右键 -> source -> generate toString来自动生成该方法，调试对象
	@Override
	public String toString() {
		return "Airplane [x=" + x + ", y=" + y + ", width=" + width + ", height=" + height + ", step=" + step + "]";
	}
	
//	public String toString() {
//		/*
//		 * 我们可以添加toString方法, 这样当使用system.out.println(目标对象)的时候会自动调用toString函数。
//		 */
//		return x + ", " + y + ", " + width;
//	}
	
	
	
	
}
