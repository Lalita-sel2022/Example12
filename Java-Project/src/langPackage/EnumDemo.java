package langPackage;

public class EnumDemo
{
	enum Gender
	{
		MALE,FEMALE,OTHER;
		
	}

	public static void main(String[] args) 
	{
		Gender g= Gender.MALE;
		//System.out.println(g.ordinal());
		System.out.println(g.name());

	}

}
