package classPractice;

public class CirclePractice 
{
	double radius ;
	
	public double calculateRea()
	{
		return Math.PI*radius*radius;
		
	}
	
	public double parimeters()
	{
		return 2*Math.PI*radius;
		
	}

	public static void main(String[] args) 
	{
		CirclePractice cir= new CirclePractice();
		cir.radius=3;
		
		System.out.println(cir.calculateRea());
		System.out.println(cir.parimeters());
		
		

	}

}
