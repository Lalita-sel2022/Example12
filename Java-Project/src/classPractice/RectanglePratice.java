package classPractice;

public class RectanglePratice 
{
	double length;
	double width;
	
	public double area()
	{
		return width*length;
		
	}
	
	public double parimeter()
	{
		return 2*(length+width);
		
	}
	
	public boolean isSquar()
	{
		if(length==width)
			return true;
		else
		return false;
		
	}

	public static void main(String[] args) 
	{
		RectanglePratice rc= new RectanglePratice();
		rc.length=3;
		rc.width =5;
		
		System.out.println(rc.area());
		System.out.println(rc.parimeter());
		System.out.println(rc.isSquar());

	}

}
