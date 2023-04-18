package demo06;

/**
 * 本demo展示，创建了一个World类，即其他类的行为都在这个里面发生。相当于一个main函数
 * 也类似于吃泡泡游戏里的BubbleApp类。
 * 这里的Demo01.java就没有什么作用了。
 * 与demo05包相比，这个包里唯一的区别就是添加了World类。然后修改了一点Airplane，其他文件与demo05一样
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
