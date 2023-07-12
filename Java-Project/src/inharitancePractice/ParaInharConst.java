package inharitancePractice;

class Rectangal
{
	int length;
	int breath;
	
	public Rectangal()
	{
		length=breath=1;
	}
	
	public Rectangal(int l, int b)
	{
		length=l;
		breath=b;
	}
	
}

class Cuboid extends Rectangal
{
	int height;
	
	
	public Cuboid()
	{
		height=1;
	}
	
	public Cuboid(int h)
	{
		height=h;
		
	}
	
	public Cuboid(int h,int l,int b)
	{
		super(l,b);
		height=h;
	}
	
	public int volume()
	{
		return length*breath*height;
	}
	
}
public class ParaInharConst 
{

	public static void main(String[] args) 
	{
		Cuboid c= new Cuboid(10,2,3);
		System.out.println(c.volume());

	}

}
