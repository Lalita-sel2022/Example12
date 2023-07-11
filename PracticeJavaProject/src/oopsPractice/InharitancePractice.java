package oopsPractice;

class Shape
{
	public void print()
	{
		System.out.println("This is a shape");
	}
}

class Rect extends Shape
{
	 @Override
	public void print()
	{
		System.out.println("This is a ractangular shape");
	}
}

class Circle extends Shape
{
	 @Override
	public void print()
	{
		System.out.println("This is a shape circule shape");
	}
}

class Squar extends Rect
{
	
	
	 @Override	
     public void print()
     {
	super.print();
	System.out.println("Square is rectangle");
    }

}

public class InharitancePractice 
{

	public static void main(String[] args)
	{
		Squar s= new Squar();
		s.print();

	}

}
