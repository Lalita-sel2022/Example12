package ClassPracticing;

public class CirculPractice 
{
	
    double r;
    public double area(double s)
    {
    	Double a=Math.PI*r*r;
    	return a;
    }
    
	/*
	 * public double perimeter(double s1) { double p=2*Math.PI*r*r; return p; }
	 */
	public static void main(String[] args) 
	{
		CirculPractice c=new CirculPractice();
		System.out.println(c.area(20));

	}

}
