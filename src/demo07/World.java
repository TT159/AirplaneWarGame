package demo07;

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
		
		airplanes[0].paint(g);
		airplanes[1].paint(g);		
		
		// airplanes[0].image.paintIcon(this, g, 0, 0);
		
		/** 值得关注！！！
		 * airplanes[0].image.paintIcon(this, g, 0, 0);
		 * 这里下面的代码报错了。上面的代码可以执行。
		 * airplanes[1].paint(g);
		 * 原因在于，从demo05开始在子类中添加image属性时，当时对Airplane做了不一样的处理。
		 * 
		 * 去查看demo05的Airplane代码可以发现，其image部分如下：
		 * ImageIcon image = new ImageIcon("images/airplane0.png"); 
		 * 这时Airplane子类有着一个与父类同名的属性image，产生了冲突。
		 * paint方法存在于父类中，对image进行绘制。子类Airplane调用继承于父类的方法paint进行绘制时，会报错。 image is null
		 * 原因在于paint方法绘制的是父类的image,正常是在创建子类对象时，子类继承父类的image属性，并利用构造器对其赋值，
		 * 然后调用父类中的paint方法对其进行绘制。
		 * 上面的代码里，初始化的是子类自己的与父类属性同名的image属性，而非父类的image属性。
		 *
		 * demo06 Airplane展示了另一种情况，依旧会出现同样的问题。
		 * 原因其实一样，子类Airplane有着和父类同名的image属性，构造器在无关键字的情况下会遵循就近原则。
		 * 因此构造器里初始化的依旧是子类自己的image属性，调用父类中的paint方法时，paint方法绘制的父类的image值仍然为空
		 * 子类只有在与父类不存在属性冲突时，构造器会默认使用继承于父类的属性。即如果子类里没有定义image属性，
		 * 那么无论是this.image还算直接的image都表示的是继承于父类的属性。
		 * 
		 * demo07里的修改是正确的。
		 */
		
		bigplanes[0].paint(g);
		bigplanes[1].paint(g);
		
		bullets[0].paint(g);
		bullets[1].paint(g);
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
