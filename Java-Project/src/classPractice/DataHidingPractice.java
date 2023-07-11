package classPractice;

public class DataHidingPractice
{
	private int length;
	private int breadth;
	
	public int area()
	{
		return length*breadth;
	}
	
	
	public int parimeter()
	{
		return 2*(length*breadth);
	}

	
	public int getLength() {
		return length;
	}


	public void setLength(int length) {
		this.length = length;
	}


	public int getBreadth() {
		return breadth;
	}


	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}


	public static void main(String[] args) 
	{
		
		DataHidingPractice rc= new DataHidingPractice();
		rc.setBreadth(4);
		rc.setLength(5);
		System.out.println(rc.getBreadth());
		System.out.println(rc.getLength());
		System.out.println(rc.area());
		System.out.println(rc.parimeter());
	}

}
