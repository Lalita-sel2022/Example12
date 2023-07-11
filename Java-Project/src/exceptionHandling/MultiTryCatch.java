package exceptionHandling;

public class MultiTryCatch
{
	
	
	public static void display(int arr[]){
	
			try {	
				int r= arr[0]/arr[1];
				System.out.println("Division is :"+r);
				
					try
					{
				    System.out.println("arr[7]"+arr[7]);
					}
					finally {
						System.out.println("Index not found");
					}
				
			}catch(ArithmeticException e){
				System.out.println("Arithmetic exception");
			}
			
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("Index is invalid");
			}
	}
	
	
     public static void main(String[] args) 
	{
		int[] A= {10,2,7,5,8};
		display(A);
		
		
	
		

	}

}
