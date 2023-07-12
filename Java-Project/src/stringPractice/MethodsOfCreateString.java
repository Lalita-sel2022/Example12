package stringPractice;

public class MethodsOfCreateString {

	public static void main(String[] args) 
	{
		String str1 ="Java";
		String str5 ="Java";
		String str2 = new String("Java");
		
		char c[]= {'H','E','l','l','o'};
		String str3= new String(c);
		
		byte b[]= {65,66,67,68};
		String str4 = new String(b);
		System.out.println(str1==str2);

	}

}
