
public class VarArgPractice
{
    static void show(int...a)
    {
    	for(int x:a)
    	{
    		System.out.println(x);
    	}
    }
	public static void main(String[] args) 
	{
		show();
		show(10,20);
		show(10,20,30);
		show(new int[] {1,2,3,4,5,6});

	}

}
