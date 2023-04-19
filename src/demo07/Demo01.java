package demo07;

/**
 * 本demo展示，对World.java中paint方法的化简。可以发现，在demo06里，我们在World.java文件中需要绘制每一个对象，很麻烦
 * 显然，我们可以在每个子类里都添加一个paint()方法，这样创建一个对象就调用其方法进行绘制即可
 * 然而我们又可以发现，每一个对象都有一个paint()方法，那么我们可以通过泛化提取到父类中。
 * 
 * 因此，本demo与demo06的区别在于，在FlyingObject类中定义paint方法，该方法被所有子类继承复用
 * 重构World中的paint，调用每个对象的paint方法即可
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
