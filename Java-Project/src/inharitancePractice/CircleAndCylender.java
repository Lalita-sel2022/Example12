package inharitancePractice;

class CirclePractice 
{
	public double r;
	
	public double area()
	{
		return Math.PI*r*r;
	}
	
	public double perimeter()
	{
		return 2*Math.PI*r;
	}

}
public class CircleAndCylender extends CirclePractice
{
	public double height;
	
	public double volume()
	{
		return area()*height;
	}
	
	
	public static void main(String[] args)
	{
		CircleAndCylender c1= new CircleAndCylender();
		c1.r=7;
		c1.height=10;
		System.out.println("Volume  "+c1.volume());
		System.out.println("Area "+c1.area());
		System.out.println("Area "+c1.perimeter());

	}

}
