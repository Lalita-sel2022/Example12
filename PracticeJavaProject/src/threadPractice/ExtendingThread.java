package threadPractice;

public class ExtendingThread
{

	public static void main(String[] args) 
	{
		AParent obj1= new AParent();
		obj1.start();
		//obj1.display();
		
		BChild  obj2=new BChild();
		obj2.start();
		//obj2.show();


	}

}
