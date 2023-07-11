package encapsulationPractice;


class Student
{
	private int rollNo;

	public int getRollNo() 
	{
		return rollNo;
	}

	public void setRollNo(int rollNo)
	{
		this.rollNo = rollNo;
	}
	
}
public class Encap1
{

	public static void main(String[] args) 
	{
		Student s= new Student();
		s.setRollNo(102);
		System.out.println(s.getRollNo());
				

	}

}
