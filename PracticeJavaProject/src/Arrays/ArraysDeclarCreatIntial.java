package Arrays;

public class ArraysDeclarCreatIntial 
{

	public static void main(String[] args) 
	{
		int sum=0;
		//int arr[]= {3,5,7};
		int []arr1=new int[4];
		arr1[0]=10;
		arr1[1]=20;
		arr1[2]=50;
		arr1[3]=40;
		
		arr1[2]=60;
		
		//System.out.println(arr1.length);
		
		 // System.out.println(arr1[3]);
		
		
		  for(int i=0;i<arr1.length;i++) { System.out.println(arr1[i]++); };
		 
		/*
		 * for(int arr:arr1) { sum=sum+arr; } System.out.println(sum);
		 */
		  
		  for(int arr:arr1)
		  {
		   
		    	System.out.println(arr);
		   }
		
	    

	}

}
