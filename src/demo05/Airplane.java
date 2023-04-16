package demo05;

import javax.swing.ImageIcon;

public class Airplane extends FlyingObject {
//	double step;
	/*
	 * 这个step属性值得注意，一开始没有将其泛化提取到父类中，是因为Hero子类没有这个属性，所以不能提取。
	 * 现在因为需要将子类中的move()方法提取到父类，父类需要step属性，因此在父类里加上了step属性
	 * 显然不能在父类中利用构造器对step赋值，因为Hero对象都没有这个属性，因此其赋值语句依旧在子类中
	 * 保持了每个子类的独特属性
	 */
	
	/*
	 * 以下就是最基础的，即Hero这个类有一个image属性，其值是确定的hero0图片。
	 * 在没有继承时，每个子类都需要这样来实现。我们将image属性抽取泛化到父类以后
	 * 就不用在每个子类里都来定义一次image属性了，而是直接在不同子类各自的构造器里来赋值即可。
	 * 泛化以后，下面的image代码不合适。因为这里是在Airplane子类中又创建了一个与父类里同名的属性image。
	 * 创建一个Airplane类对象，就会有Airplane.image属性且值恒定为下面所赋的值，无需构造器
	 * 但是，从父类那也会继承一个image属性，这个属性未被赋值。
	 * 因此很容易造成混乱和bug，在demo07 World文件中有体现。
	 */
	ImageIcon image = new ImageIcon("images/airplane0.png"); 
	
	public Airplane(double x, double y, double width, 
			double height, double step) { 
		/*
		 * 这里的构造器参数里不需要： ImageIcon image
		 * 原因是这个图片属性，不是需要用户输入的参数，如果写在这里面，
		 * 那么每一次创建对象实例的时候，需要输出image属性对应的值。
		 * 其是默认的属性，有固定的值，不需要用户来设定。
		 * 在父类里定义了image属性，所以就直接继承这个属性并对其初始化即可。
		 */
		super(x, y, width, height);
		this.step = step; 
		
		/*
		 * 初始化image属性。如果这里父子类的属性，方法不冲突，两者均表示的是同一个image属性
		 * 即默认为继承于父类的image属性，所以写this.和不写，都表示的是继承于父类的image属性。
		 * this.image = new ImageIcon("images/airplane0.png");
		 * image = new ImageIcon("images/airplane0.png");
		 * 但是目前的情况不同，目前的代码里父子属性冲突了。无论是this.还是不写this.表示的都是当前子类的image属性
		 * 两者都只是初始化了子类的image属性，继承于父类的image依旧为空
		 */
	
	}

	// 将这个方法提取到父类中
//	public void move() {
//		y += step;
//	}

}
