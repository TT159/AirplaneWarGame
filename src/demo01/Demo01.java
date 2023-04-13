package demo01;

public class Demo01 {

	public static void main(String[] args) {
		/*
		 * build objects
		 */
		
		Airplane plane = new Airplane(40, 40, 50, 40, 1);
		Bigplane plane2 = new Bigplane(300, 20, 150, 180, 2);
	
		plane.move();
		System.out.println(plane.x + ", " + plane.y);
		plane.move();
		System.out.println(plane.x + ", " + plane.y);
		
		/*
		 * 我们可以添加toString方法来简化上面的输出语句。
		 * 当没有在类中添加toString方法时，直接打印输出对象，得到的结果是
		 */
		System.out.println(plane);
		System.out.println(plane2); //没有toString方法时，输出： demo01.Bigplane@6f2b958e   即对象的引用地址
		
	}

}
