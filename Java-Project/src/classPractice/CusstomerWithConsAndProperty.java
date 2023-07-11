package classPractice;

public class CusstomerWithConsAndProperty 
{
	private int cusid;
	private String name;
	private String address;
	private long phno;
	
	
	//public CusstomerWithConsAndProperty(int cusid,String name,String address, long phno )
	//{
		//setCusid(cusid);
		//setName(name);
		//setAddress(address);
		//setPhno(phno);
		
	//}
	
	public CusstomerWithConsAndProperty(int cusid)
	{
		setCusid(cusid);
	}
	public void setCusid(int id)
	{
		cusid=id;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	public void setAddress(String address)
	{
		this.address=address;
	}
	public void setPhno(long phone)
	{
		phno=phone;
	}
	
	public int getCusid() {return cusid; }
	
	
	

	public static void main(String[] args)
	{
		
		CusstomerWithConsAndProperty c= new CusstomerWithConsAndProperty(121);
		System.out.println(c.getCusid());
	}

}
