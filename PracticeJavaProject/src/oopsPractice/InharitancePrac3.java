package oopsPractice;


class Rectangle
{

	float l;
	float b;
	
	public  Rectangle(float l, float b)
	{
		this.l=l;
		this.b=b;
	}
	
	public void area() 
	{
		float a=l*b;
		System.out.println("Area of rectangle is :"+a);
	}
	
	public void parimeter() 
	{
		float p=2*(l+b);
		System.out.println("parimeter of rectangle is ::"+p);
	}
	
	
}

class Square extends Rectangle
{
	int s;

	public Square(int s) 
	{
	    super(s, s);
		
	}

	
	
}

public class InharitancePrac3
{

	public static void main(String[] args)
	{
		System.out.println("Hello");
		Rectangle r=new Rectangle(10,30);
		r.area();
		r.parimeter();
		
		System.out.println("*********************************************************");
		
		Square r1=new Square(10);
		r1.area();
		r1.parimeter();
	}

}
