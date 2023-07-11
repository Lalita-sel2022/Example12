package practice;

class Animals {
	
	public  void makeSound()
	{
	   System.out.println("Animals make a sound");	
	}

}

public class Cat extends Animals {
	
	
	public void  makeSound() {
		
		//super.makeSound();
		System.out.println("The cat quarrels.");
	}
	

	public void test()
	{
		System.out.println("Child class");
	}
	public static void main(String[] args) {
		
		Animals c= new Cat();
		c.makeSound();
		
		
		
		

	}

}
