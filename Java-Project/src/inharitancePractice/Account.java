package inharitancePractice;

public abstract class Account 
{
	private long accountNo;
	private String name;
	private String address;
	private String dob;
	private long balance;
	
	
	public Account(long accountNo,String name,String address, String dob, long balance)
	{
		this.accountNo=accountNo;
		this.name=name;
		this.balance=balance;
		setAddress(address);
		setdob(dob);
	}
	public void setAddress(String address)
	{
		this.address=address;
		
	}
	public void setdob(String dob)
	{
		this.dob=dob;
	}
	
	public long getAccountNo(){ return accountNo;}
	public String getName(){ return name;}
	public String getAddress(){ return address;}
	public String getDob(){ return dob;}
	public long getBalance(){ return balance;}
	
	
	public abstract void close();
	{
		
	}

}
