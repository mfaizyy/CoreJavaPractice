package FinalKeyword;

class Bike9
{
	final void run()
	{
		System.out.println("Bike is running...");
	}
}

public class Bike1 extends Bike9
{
	void run()
	{
		System.out.println("Bike is running safely...");
	}
	public static void main(String[] args) 
	{
		Bike1 b = new Bike1();
		b.run();
	}
}
