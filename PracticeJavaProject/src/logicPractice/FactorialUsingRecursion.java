package logicPractice;

public class FactorialUsingRecursion 
{
	int i=1;
	public int factoRecursion(int num)
	{
		factoRecursion(num);
		num=num*i;
		num--;
		return num;
	}

	public static void main(String[] args) 
	{
		FactorialUsingRecursion s= new FactorialUsingRecursion();
		int sum=s.factoRecursion(3);

	}

}
