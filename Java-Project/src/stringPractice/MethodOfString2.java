package stringPractice;

public class MethodOfString2 {

	public static void main(String[] args) 
	{
		String s1="The quick brown fox jumps over the lazy dog";
		//String s2="java";
		
		
		/*
		 * int res=s1.compareToIgnoreCase(s2);
		 * 
		 * System.out.println(res); if(res<0) {
		 * System.out.println("First string is less than the second string");
		 * 
		 * } else if(res>0) {
		 * System.out.println("First string is greater than second string"); } else {
		 * System.out.println("String is equal"); }
		 */

		//System.out.println(s1.concat(s2));
		
		//System.out.println(s1.contains("and"));
		//String str=s1.substring(6);
		//System.out.println(str);
		
		//System.out.println(s1.equals(s2));
		
	    //byte b[]=s1.getBytes();
	    
	   // String new_str= new String(b);
	    
	    //System.out.println(new_str);
		//System.out.println(s1.hashCode());
		
		
	    //System.out.println(s1);
		//String str=s1.replace("dog", "fox");
		//System.out.println(str);
		//System.out.println(s1.subSequence(10, 25));
		
		char c[]= {'j','a','v','e','x','c',};
		
		String str= new String(c);
		System.out.println(str.toUpperCase());
	    
	    
		
	}

}
