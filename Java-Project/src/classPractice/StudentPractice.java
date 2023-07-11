package classPractice;

public class StudentPractice 
{
	
	int age;
	String name;
	long rollNo;
	String course;
	int m1,m2,m3,m4,m5;
	
	public int total()
	{
		return m1+m2+m3+m4+m5;
		
	}
	
	public float avr()
	{
		return (float)total()/5;
	}
	
	public String grade(double average)
	{
		if(average>=60)
		{
			return "A";
		}
		else if(average<60 && average>=50)
		return "B";
		else
			return "c";
		
	}
	
	

	public static void main(String[] args) 
	{
		StudentPractice s=new StudentPractice();
		s.m1=50;
		s.m2=49;
		s.m3=50;
		s.m4=50;
		s.m5=50;
		System.out.println(s.total());
		double average = s.avr();
		System.out.println(s.avr());
		System.out.println(s.grade(average));
		

	}

}
