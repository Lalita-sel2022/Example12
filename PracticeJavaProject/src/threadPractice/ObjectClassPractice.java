package threadPractice;

public class ObjectClassPractice 
{

	public static void main(String[] args) 
	{
		ObjectClassPractice obj=new ObjectClassPractice();
		
		ObjectClassPractice obj1=new ObjectClassPractice();
		
		System.out.println("toString method :"+obj.toString());
		
		System.out.println("hashCode method :"+obj.hashCode());
		
		System.out.println("hashCode method :"+obj1.hashCode());
		
		System.out.println("equals method :"+obj.equals(obj1));
		
		System.out.println("getClass method :"+obj.getClass());
		
		
		System.out.println("getClass method :"+obj);
		
		
		

	}


}
