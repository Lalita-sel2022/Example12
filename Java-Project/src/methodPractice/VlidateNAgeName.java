package methodPractice;



public class VlidateNAgeName 
{
	public static  boolean validName(String str)
	{
		/*
		 * boolean matches = Pattern.matches("[a-zA-Z]*", str);
		 * System.out.println("matching-------- "+matches); return matches;
		 */
		return str.matches("^[a-zA-Z ]*$");
		
	}

	public static void main(String[] args) 
	{
		String s="lalita saini";
	    System.out.println(validName(s));
		
	}

}
