package inharitancePractice;

public class SavingAccount extends Account
{
	public SavingAccount(long accountNo, String name, String address, String dob, long balance)
	{
		super(accountNo, name, address, dob, balance);
		
	}

	public long withdraw(long amount)
	{
		//long totalBal;
		//return totalBal =getBalance()-amount;
		return amount;
		
	}
	public void depositAmount(long amount)
	{
		//balance+=amount;
		//System.out.println("Deposite amount is "+balance+amount);
		//getBalance()+amount;
		
	}
	@Override
	public void close()
	{
		System.out.println("Requesting to close saving account");
	}

	public static void main(String[] args) 
	{
		SavingAccount sa= new SavingAccount(12345678, "Rahul Sharma","ABC Noida","02/08/1997", 300000);
		//System.out.println("Total blance is "+sa.withdraw(2000));
		//sa.close();
		
		System.out.println("Account Number - "+sa.getAccountNo());
		System.out.println("Name - "+sa.getName());	
		System.out.println("Address - "+sa.getAddress());
		System.out.println("Date of Birth - "+sa.getDob());
		
		sa.depositAmount(3000);
		System.out.println("Withdraw amount - "+sa.withdraw(2000));

	}



}
