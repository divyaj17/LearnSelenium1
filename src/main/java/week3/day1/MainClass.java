package week3.day1;

public class MainClass 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
			Samsung sam=new Samsung();
			sam.makeCall();
			sam.makeCall();
			sam.takeSnap();
			sam.sendMessage();
			
			Iphone iph=new Iphone();
			iph.makeVideoCall("Hi");
						
			iph.takeSnap();
			iph.makeCall();
			iph.sendMessage();

	}

}
