package innerClass;

public class OuterClass 
{
	int x=10;
	//Inner in= new Inner();
	class Inner
	{
		int y=20;
		public void innerMethod()
		{
			System.out.println(x +"  "+y);
		}
	}
	
	public void outerMethod()
	{
		//Inner in= new Inner();
		//System.out.println(in.y);
		//in.innerMethod();
	 
	}

	public static void main(String[] args) 
	{
		OuterClass.Inner ou= new OuterClass().new Inner();
		//ou.outerMethod();
		ou.innerMethod();

	}

}
