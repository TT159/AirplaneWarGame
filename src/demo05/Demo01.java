package demo05;

/**
 * 本demo展示，将为每一个类加上其对应的图片。显然每个类都有'图片'这个属性，我们泛化抽取到父类里
 * 但是每个子类的'图片'属性的值又不一样，所以我们在子类中再进行初始化，在父类里进行定义
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
