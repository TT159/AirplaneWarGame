package demo06;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

/*
 * World 继承于 JPanel
 * 在main方法中创建窗口，窗口中添加World对象
 * 给World添加构造器，初始化天空，飞机，子弹，英雄
 * 重写paint方法，绘制天空，飞机....
 */
public class World extends JPanel {

	Airplane[] airplanes;// Airplane类型的数组变量， airplane
	Bigplane[] bigplanes;
	Bullet[] bullets;
	Sky sky; // Sky类型的变量sky
	Hero hero;
	// 此时上面的变量均为空。还未赋值。只是创建了这么些个属性变量，没赋值，也没有具体的实例对象
	
	// 利用构造器来初始化，World中的每个物体
	public World() {
		airplanes = new Airplane[2];
		airplanes[0] = new Airplane(10, 10, 50, 40, 1.5);
		airplanes[1] = new Airplane(10, 100, 50, 40, 1.5);
		
		bigplanes = new Bigplane[2];
		bigplanes[0] = new Bigplane(100, 20, 90, 80, 2);
		bigplanes[1] = new Bigplane(100, 220, 90, 80, 2);
		
		bullets = new Bullet[2];
		bullets[0] = new Bullet(200, 400, 10, 10, 4);
		bullets[1] = new Bullet(200, 350, 10, 10, 4);
		
		sky = new Sky(0, 0, 400, 700, 0.8);
		hero = new Hero(200, 500, 200, 200);
	}
	
	// paint()本身是JPanel自带的方法，我们进行重写。用于绘制
	public void paint(Graphics g) {
		// 将天空绘制在天空的位置(x, y)上，double要转int
		sky.image.paintIcon(this, g, (int)sky.x, (int)sky.y); // ImageIcon类型提供的绘图方法
		hero.image.paintIcon(this, g, (int)hero.x, (int)hero.y);
		
		airplanes[0].image.paintIcon(this, g, (int)airplanes[0].x, (int)airplanes[0].y);
		airplanes[1].image.paintIcon(this, g, (int)airplanes[1].x, (int)airplanes[1].y);
		
		bigplanes[0].image.paintIcon(this, g, (int)bigplanes[0].x, (int)bigplanes[0].y);
		bigplanes[1].image.paintIcon(this, g, (int)bigplanes[1].x, (int)bigplanes[1].y);
		
		bullets[0].image.paintIcon(this, g, (int)bullets[0].x, (int)bullets[0].y);
		bullets[1].image.paintIcon(this, g, (int)bullets[1].x, (int)bullets[1].y);
	}
	 
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		World world = new World(); //继承于JPanel。初始化了'世界'里的一切对象
		
		// 因为world实际上继承的JPanel, 将'画稿'world加到'画框'frame里
		// 然后在setVisible()时会自动调用paint()方法，因此我们可以得到目前的效果
		frame.add(world);
		frame.setSize(400, 700);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}

}
