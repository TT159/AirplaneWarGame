package demo02;

/**
 * 本demo展示，泛化子类中的属性与共有方法toString()。
 * @author tt2ma
 *
 */

public class Demo01 {

	public static void main(String[] args) {
		
		Airplane plane = new Airplane(40, 40, 50, 40, 1);
		Bigplane plane2 = new Bigplane(300, 20, 150, 180, 2);
		Bullet bullet = new Bullet(300, 500, 10, 20, 5);
		Hero hero = new Hero(200, 600, 150, 150);
		Sky sky = new Sky(0, 0, 560, 800, 0.8);
	
		plane.move();
		System.out.println(plane.x + ", " + plane.y);
		plane.move();
		System.out.println(plane.x + ", " + plane.y);
		
		/*
		 * 在有了父类FlyingObject以后，所有的子类的toStrng方法都是继承得父类中的
		 * 因此此时打印出来的是FlyingObject [x=40.0, y=42.0, width=50.0, height=40.0]
		 * 不会显示每个子类的类名，因此我们需要去父类中处理一下toString方法
		 */
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
