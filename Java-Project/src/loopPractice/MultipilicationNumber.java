package loopPractice;
import java.util.Scanner;

public class MultipilicationNumber {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int no=sc.nextInt();
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(i*no);
		}

	}

}
