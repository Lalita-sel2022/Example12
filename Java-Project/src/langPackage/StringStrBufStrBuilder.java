package langPackage;

public class StringStrBufStrBuilder
{

	public static void main(String[] args) 
	{
		String s="Lalita";
		StringBuffer s1= new StringBuffer("Hello");
		StringBuilder s2 = new StringBuilder("Hello");
		
		s.concat("World");
		s1.append("World");
		s2.append("Worlds");
		
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s2);
	

	}

}
