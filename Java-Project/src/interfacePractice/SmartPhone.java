package interfacePractice;

class Phone
{
	public void call()
	{
		
	}
	
	public void message()
	{
		
	}
	
}

interface Camera
{
	void click();
	void record();
	
}

interface MusicPlayer
{
	void play();
	void pause();
	
}
public class SmartPhone extends Phone implements Camera,MusicPlayer
{
	@Override
	public void call()
	{
		System.out.println("Calling...");
	}

	public void message()
	{
		System.out.println("messaging...");
	}
	public static void main(String[] args)
	{
		
		MusicPlayer samsung= new SmartPhone();
		//samsung.call();
		//samsung.message();
		//samsung.click();
		//samsung.record();
		samsung.play();
		samsung.pause();
		
	}
	
	public void videoCall()
	{
		System.out.println("Do recording call by smartphone");
	}

	@Override
	public void play() 
	{
		System.out.println("Play music");
		
	}

	@Override
	public void pause() 
	{
		System.out.println("Pause music");
		
	}

	@Override
	public void click() 
	{
		System.out.println("Click Photo");
		
	}

	@Override
	public void record() 
	{
		System.out.println("Recording...");
		
	}

}
