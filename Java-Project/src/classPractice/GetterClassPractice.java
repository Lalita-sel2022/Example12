package classPractice;

public class GetterClassPractice 
{
	private long accountNo =1234545456;
	
	public long getAccountNo()
	{
		return accountNo;
	}

	public static void main(String[] args) 
	{
		
		GetterClassPractice gt= new GetterClassPractice();
		System.out.println(gt.getAccountNo());
	}

}
