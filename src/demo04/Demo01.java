package demo04;

/**
 * 本demo展示，将子类中共有的move()方法提取到父类中，个别子类中特殊的move()方法利用重写实现其功能，保持其独特性
 * 同时，多加了一个Bee类型，来展示对父类中方法的重写拓展
 * Hero.java知识点较多
 */

public class Demo01 {

	public static void main(String[] args) {
		Airplane plane = new Airplane(40, 40, 50, 40, 1);
		Bigplane plane2 = new Bigplane(300, 20, 150, 180, 2);
		Bullet bullet = new Bullet(300, 500, 10, 20, 5);
		Hero hero = new Hero(200, 600, 150, 150);
		Sky sky = new Sky(0, 0, 560, 800, 0.8);
	
		plane.move();
		System.out.println(plane);
		plane.move();
		System.out.println(plane);
		
		plane2.move();
		System.out.println(plane2);
		plane2.move();
		System.out.println(plane2);
		
		bullet.move();
		System.out.println(bullet);
		bullet.move();
		System.out.println(bullet);
		
		hero.move(200, 400);
		System.out.println(hero);
		
		sky.move();
		System.out.println(sky);
		sky.move();
		System.out.println(sky);
		
	}

}
