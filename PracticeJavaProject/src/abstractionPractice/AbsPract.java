package abstractionPractice;

abstract class prnt
{
	public abstract void message();
	
}

class Cld1 extends prnt
{
	@Override
	public void message()
	{
		System.out.println("This is first subclass");
	}
}

class Cld2 extends Cld1
{
	@Override
	public void message()
	{
		super.message();
		System.out.println("This is second subclass");
	}
	
}
public class AbsPract
{

	public static void main(String[] args) 
	{
		//Cld1 c= new Cld1();
		//c.message();
		
		Cld2 c1= new Cld2();
		c1.message();

	}

}
