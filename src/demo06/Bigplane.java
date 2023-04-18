package demo06;

import javax.swing.ImageIcon;

public class Bigplane extends FlyingObject {
//	double step;
	
	public Bigplane(double x, double y, double width, double height, double step) {
		super(x, y, width, height);
		this.step = step;
		this.image = new ImageIcon("images/bigairplane0.png");
	}

//	public void move() {
//		y += step;
//	}
	
}
