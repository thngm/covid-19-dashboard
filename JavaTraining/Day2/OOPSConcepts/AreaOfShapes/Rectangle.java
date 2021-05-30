package Shapes;

public class Rectangle extends Shape{
	
	double length,width;
	
	Rectangle(double length,double width)
	{
		this.length=length;
		this.width=width;
	}
	//area is calculated
	double area()
	{
		return length*width;
	}

}
