package Shapes;

public class Circle extends Shape{
	double radius;
	Circle(double radius)
	{
		this.radius=radius;
	}
	//area is calculated
	double area()
	{
		return Math.PI*radius*radius;
	}

}
