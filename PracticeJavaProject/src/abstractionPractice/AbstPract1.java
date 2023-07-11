package abstractionPractice;

abstract class Bank
{
	public abstract float getBalance();
}

class BankA extends Bank
{
	@Override
	public float getBalance()
	{
		return 100;
		
	}
}

class BankB extends BankA
{
	
	@Override
	public float getBalance()
	{
		return 150;
		
	}
}

class BankC extends BankB
{
	@Override
	public float getBalance()
	{
		return 200;
		
	}
}



public class AbstPract1 
{

	public static void main(String[] args) 
	{
		System.out.println("Hello");
		BankC b1= new BankC();
		System.out.println(b1.getBalance());

	}

}
