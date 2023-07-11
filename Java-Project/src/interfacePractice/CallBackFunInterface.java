package interfacePractice;

interface Member
{
	void callback();
	
}

class Customer implements Member
{
	String cusName;
	Customer(String m)
	{
		cusName=m;
	}
    @Override
	public void callback() 
	{
		System.out.println("Yes, I will call back "+cusName);
		
	}
	
}
class Store
{
	Member mem[]= new Member[50];
	int count=0;
	
	public void reg(Member m)
	{
		mem[count++]=m;
	}
	
	public void inviteMem()
	{
		for(int i=0;i<count;i++)
		{
			mem[i].callback();
		}
	}
	
	
}
public class CallBackFunInterface 
{
	public static void main(String[] args) 
	{
	
		Store s= new Store();
		Customer c1= new Customer("Lalita");
		Customer c2= new Customer("Sonam");
		s.reg(c1);
		s.reg(c2);
		s.inviteMem();
	
		
		
	}

}
