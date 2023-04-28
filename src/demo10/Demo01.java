package demo10;

/**
 * 在demo09里虽然利用定时器实现了物体的移动，但是天空的移动会出现空白甚至拖尾的状况
 * 本demo展示，将实现天空的交替滚动。利用两张图片不断的反复交替滚动，就可以实现连续不断的天空背景
 * 对Sky.java要进行修改，原来是一张图片，现在要变成两张图片了。
 * 同时在本文件里，对Sky进行了单元测试
 */

public class Demo01 {

	public static void main(String[] args) {
		Airplane plane = new Airplane(10, 10, 50, 40, 1.5);
		Bigplane plane2 = new Bigplane(300, 20, 150, 180, 2);
		Bullet bullet = new Bullet(300, 500, 10, 20, 5);
		Hero hero = new Hero(200, 600, 150, 150);
		Sky sky = new Sky(0, 0, 560, 1000, 0.8);
		Bee bee = new Bee(20, 30, 13, 15, 2);
	
		// getImageLoadStatus()方法可以返回图片的加载结果，如果返回8，则表示图片加载成功
		System.out.println(sky.image.getImageLoadStatus());
		System.out.println(hero.image.getImageLoadStatus());
		System.out.println(bullet.image.getImageLoadStatus());
		System.out.println(bullet.image.getImageLoadStatus());
		System.out.println(plane2.image.getImageLoadStatus());
		System.out.println(plane.image.getImageLoadStatus());
		System.out.println(bee.image.getImageLoadStatus());
		
		/*
		 * Sky单元测试
		 * 创建一个Sky对象以后，让其交替滚动几遍，检查输出。
		 */
		
		for(int i = 0; i < 5000; i++) {
			sky.move();
		}
	}

}
