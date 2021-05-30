package Shapes;

public class Main {
	public static void main(String args[])
	{
		Rectangle rectangle=new Rectangle(5,3);
		System.out.println("Area of Rectangle "+ rectangle.area());
		
		Triangle triangle=new Triangle(2,6);
		System.out.println("Area of Triangle "+ triangle.area());
		
		Circle circle=new Circle(5);
		System.out.println("Area of Circle "+ circle.area());
		
		Square square=new Square(4);
		System.out.println("Area of Square "+ square.area());
	}

}
