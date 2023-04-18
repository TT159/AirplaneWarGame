package demo06;

import javax.swing.ImageIcon;

public class Sky extends FlyingObject {
//	double step;
	
	public Sky(double x, double y, double width, double height, double step) {
		super(x, y, width, height);
		this.step = step;
		this.image = new ImageIcon("images/background.png");
	}

//	public void move() {
//		y += step;
//	}

	
	
}
