package threadPractice;

class Video extends Thread
{
	@Override
	public void run()
	{
	//public void videoPlaying()
	
		for(int i=0;i<5;i++)
		{
			System.out.println("Video is playing :"+i);
		}
	
	}
	
}

class Audio extends Thread
{
	
     @Override
	public void run()
	{
	
	
		for(int i=0;i<5;i++)
		{
			System.out.println("Audio is playing :"+i);
		}
		
		
	
}
}
public class VLC 
{

	public static void main(String[] args) 
	{
		   //Create thread
				Video v= new Video();
				//v.videoPlaying();
				//run thread
				v.start();
				
				//System.out.println(Thread.currentThread());
			
				
				//Naming method
				//System.out.println(Thread.currentThread().getName());
				//get name
				System.out.println(v.getName());
				//set name
				//v.setName("Lalita");
				//System.out.println(v.getName());
					
				System.out.println(v.isAlive());
				
				
				
				Audio a= new Audio();
				//a.audioPlaying();
				a.start();
				System.out.println(a.getName());
				
				//System.out.println(Thread.currentThread().getName());
	}
		
}
		
	  

	


