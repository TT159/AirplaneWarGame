package demo11;

import javax.swing.ImageIcon;

public class Hero extends FlyingObject {
	
	public Hero(double x, double y, double width, double height) {
		super(x, y, width, height);
		this.image = new ImageIcon("images/hero0.png");
	}

	/*
	 *  方法的重写。重写继承于父类的move方法，作用就是修改了父类的move行为
	 *  父类是向下运动，修改为不动。原因是修改父类中的方法，方法名和参数必须与父类一样。
	 *  这样的话，父类的方法相当于在Hero子类没有用。
	 *  然后，我们利用了方法的重载。这样编译器会根据输入参数，自动调用对应的那个move方法，即第二个
	 */ 
	public void move() { // 父类方法重写。空方法，即其实就是不想利用父类的move方法
		
	}
	
	/*
	 * 方法重载 ！= 父类方法重写 ！= 父类方法复用
	 * 父类方法重写。子类中重写父类的方法，因为子类想实现不同的算法逻辑，但是需要与父类中的该方法同名，同参数
	 * 方法重载。是一个类中的多个同名方法，但是不同参数，想实现的逻辑也是不同的
	 * 父类方法的复用。 复用显而易见就是重复利用，在子类中利用super.关键字来复用父类中的方法。
	 */
	public void move(int x, int y) { // 类内部的方法重载，不是对父类方法的重写
		this.x = x;
		this.y = y;
	}
	
}
