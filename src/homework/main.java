package homework;

abstract class Shape{
	abstract void numberOfSides();
}
class Trapezoid extends Shape
{
	void numberOfSides()
	{
		System.out.println("sides are 4");
	}
}
class Triangle extends Shape
{
	void numberOfSides()
	{
		System.out.println("sides are 3");
	}
}
class Hexagon extends Shape
{
	void numberOfSides()
	{
		System.out.println("sides are 6");
	}
}


public class main {
public static void main(String[] args) {
	Shape s=new Hexagon();
	s.numberOfSides();
	s=new Trapezoid();
	s.numberOfSides();
	s=new Triangle();
	s.numberOfSides();
	
}
	
}
