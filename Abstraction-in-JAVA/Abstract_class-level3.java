import java.io.*;
import java.util.*;
abstract class Mobile
{
	abstract void switchon();
	abstract void call();
	abstract void movie();
}
class Bootstrap 
{	
	public void switchon()
	{
	System.out.println("Welcome..Plz wait switching on your Mobile.");
	}

}
class Dialer 
{
	public void call()
	{
		System.out.println("Dial the phone number(5 digits): ");
		Scanner sc =new Scanner(System.in);
		int no =sc.nextInt();
		System.out.println("phone number is : 05522-"+no);
		sc.close();
	}
}


class Multimedia
{
	public void movie()
	{
		// System.out.println("enter the movie you want to watch: ");
		//we can even put an scan option and search the movie in directory
		System.out.println("Your movie is starting....");
	}
}

class Main
{
	public static void main(String[] args) 
	{
		Multimedia m=new Multimedia();
		Bootstrap s=new Bootstrap();
		Dialer cc=new Dialer();

		s.switchon();
		cc.call();
		m.movie();

	}
}	
