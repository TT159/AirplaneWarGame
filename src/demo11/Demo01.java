package demo11;

/**
 * 3.25.2023
 * 本demo将使用学习到的封装知识，给代码加上访问控制修饰词。
 * 从子类中提取到父类的属性、方法，适合使用protected来修饰。
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
