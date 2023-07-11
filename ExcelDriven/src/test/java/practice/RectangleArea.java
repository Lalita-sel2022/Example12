package practice;

class Shape
{
	public int getArea()
	{
		System.out.println("Find area");
		return 0;
	}
}
public class RectangleArea extends Shape 
{
	public int getArea()
	{
		//super.getArea();
		int l=20;
		int w=30;
		return l*w;
	}
	

	public static void main(String[] args) 
	{
		Shape r= new RectangleArea();
		System.out.println("Area of rectangle is : "+r.getArea());

	}

}
