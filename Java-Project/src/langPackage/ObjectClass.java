package langPackage;

class MyClass
{
	//@Override
	/*public String toString()
	{
		
		return "My Object";
	}*/
	
}
public class ObjectClass extends MyClass
{

	public static void main(String[] args) 
	{
		MyClass obj= new MyClass();
		System.out.println(obj);
		//Object obj= new Object();
		Object obj1=obj ;
		//System.out.println(obj.toString());
		//obj.getClass();
		// System.out.println(obj.equals(obj1));
		System.out.println(obj);

	}

}
