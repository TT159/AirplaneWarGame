package demo09;

/**
 * 本demo展示，将实现所有对象的移动。在World里加了一个定时器Timer
 * repaint()是Swing带来的方法，World从JPanel继承过来的方法。其的功能是重绘。
 * repaint()方法会自动执行paint()方法绘制整个面板
 * 当间隔时间小于1/15秒的时候，视觉感受就是平滑运动了。
 * plane.move()
 * repaint()
 * 飞机移动一次后，就根据飞机的位置重绘一次，就感觉飞机运动起来了
 *
 * 重构，利用循环遍历数组元素。
 */

public class Demo01 {

	public static void main(String[] args) {
		Airplane plane = new Airplane(10, 10, 50, 40, 1.5);
		Bigplane plane2 = new Bigplane(300, 20, 150, 180, 2);
		Bullet bullet = new Bullet(300, 500, 10, 20, 5);
		Hero hero = new Hero(200, 600, 150, 150);
		Sky sky = new Sky(0, 0, 560, 800, 0.8);
		Bee bee = new Bee(20, 30, 13, 15, 2);
	
		// getImageLoadStatus()方法可以返回图片的加载结果，如果返回8，则表示图片加载成功
		System.out.println(sky.image.getImageLoadStatus());
		System.out.println(hero.image.getImageLoadStatus());
		System.out.println(bullet.image.getImageLoadStatus());
		System.out.println(bullet.image.getImageLoadStatus());
		System.out.println(plane2.image.getImageLoadStatus());
		System.out.println(plane.image.getImageLoadStatus());
		System.out.println(bee.image.getImageLoadStatus());
	}

}
