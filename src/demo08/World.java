package demo08;

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
	
	public void paint(Graphics g) {
		// 在FlyingObject里写了paint方法以后，这里就只需要调用那个方法了。不用再写一大堆
		sky.paint(g); 
		hero.paint(g);
		
		for(int i = 0; i < bullets.length; i++) {
			bullets[i].paint(g);
		}
		
		for(int i = 0; i < airplanes.length; i++) {
			airplanes[i].paint(g);
		}
		
		for(int i = 0; i < bigplanes.length; i++) {
			bigplanes[i].paint(g);
		}

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
