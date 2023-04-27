package demo09;

import java.awt.Graphics;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;
import javax.swing.JPanel;

/*
 * World 继承于 JPanel
 * 创建定时任务内部类，执行飞机的move()方法移动每个飞机，移动后执行repaint()，
 * 其会调用我们(demo07)重写的继承于父类JPanel的paint方法
 * 在World中添加action方法，在action方法中启动定时器
 * 在main方法中显示窗口后调用action方法，也就是显示窗口以后启动定时器
 */
public class World extends JPanel {

	Airplane[] airplanes;// Airplane类型的数组变量， airplane
	Bigplane[] bigplanes;
	Bullet[] bullets;
	Sky sky; // Sky类型的变量sky
	Hero hero;
	
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
		
		/*
		 * 要先绘制了面板（初始状态）后，再执行action方法
		 */
		world.action();
	}
	
	/*
	 * 添加内部类，实现定时计划任务
	 * 1，隐藏定时任务到World类中
	 * 2，可以访问外部类，中的数据，如飞机，子弹等
	 */
	class PaintTask extends TimerTask{
		
		// 重写继承于TimerTask里的run方法，不写run方法会报错
		public void run() {
//			airplanes[0].move();
//			airplanes[1].move();	
//			bullets[1].move();
			
			// 利用for循环来简化上方代码
			for(int i = 0; i < airplanes.length; i++) {
				airplanes[i].move();
			}
			for(int i = 0; i < bigplanes.length; i++) {
				bigplanes[i].move();
			}
			for(int i = 0; i < bullets.length; i++) {
				bullets[i].move();
			}
			sky.move();		
			// hero不是按定时器固定移动的。
			
			repaint();
			// repaint()是Swing带来的方法，World从JPanel继承过来的方法。其的功能是重绘。
			// repaint()方法会自动执行paint()方法绘制整个面板
		}
	}
	
	/*
	 * 创建action方法，即设计定时器
	 */
	public void action() {
		Timer timer = new Timer();
		PaintTask task = new PaintTask();
		timer.schedule(task, 1000, 1000/100); 
	}
}
