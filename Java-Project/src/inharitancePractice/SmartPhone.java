package inharitancePractice;


class CellPhone
{
	public long phNumber;
	public String imieNo;
	
	public void call()
	{
		System.out.println("Calling....");
	}
	
	public void saveNumber(long number)
	{
		System.out.println("Save "+number+"in cell phone");
	}
	
	public void deleteNumber(long number)
	{
		System.out.println("Delete "+number+" from cell phone");
	}
	
	
	
}


public class SmartPhone extends CellPhone
{
	public int mac;
	
	public void playGame(String game)
	{
		System.out.println("Play the game");
	}
	
	public void clickPhoto()
	{
		System.out.println("Click photo");
	}
	
	public void captureVideo()
	{
		System.out.println("Capture video");
	}

	public static void main(String[] args)
	{
		SmartPhone samsung = new SmartPhone();
		samsung.call();
		samsung.saveNumber(56565367);
		samsung.deleteNumber(67546777);
		samsung.mac=66566;
		samsung.clickPhoto();
		

	}

}
