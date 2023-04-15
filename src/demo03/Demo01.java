package demo03;

/**
 * 本demo展示，子类调用super()方法来复用父类中的构造器。以简化子类中的构造器部分代码。
 * @author tt2ma
 */

public class Demo01 {

	public static void main(String[] args) {
		Airplane plane = new Airplane(40, 40, 50, 40, 1);
		Bigplane plane2 = new Bigplane(300, 20, 150, 180, 2);
		Bullet bullet = new Bullet(300, 500, 10, 20, 5);
		Hero hero = new Hero(200, 600, 150, 150);
		Sky sky = new Sky(0, 0, 560, 800, 0.8);
	
		System.out.println(plane);
		System.out.println(plane2); 
		
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
