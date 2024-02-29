package abtractMethod;

abstract class Vehicle
{
	int no_of_tyres;
	 abstract void start();
	 void display()
		{
			System.out.println("InterProg Display");
		}
}

 class car extends Vehicle
{
	 void start()
	{
		System.out.println("Car starts with Key");
	}
}
class scooter extends Vehicle
{
	public void start()
	{
		System.out.println("Scooter starts with kick and keys");
	}
}

public class AbstractDemo
{
	public static void main(String[] args)
	{
		
		car c = new car();
		c.start();
		c.display();
		scooter s=new scooter();
		s.start();
	
	}
	
}

