package logicPractice;

public class Largest3Number 
{

	public static void main(String[] args)
	{
      int a=20,b=60,c=40;
      
      if(a>b&&a>c)
      {
    	  System.out.println("Greatest number is :"+a);
      }
      else if(b>a&&b>c)
      {
    	  System.out.println("Greatest number is :"+b);
      }
      else
      {
    	  System.out.println("Greatest number is :"+c);
      }
	}

}