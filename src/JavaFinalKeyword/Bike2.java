package JavaFinalKeyword;
// final class can not be override 


final class Bike3
{
	void run()
	{
		System.out.println("running...");
	}
}

public class Bike2 extends Bike3
{
	public static void main(String[] args) 
	{
		Bike2 b = new Bike2();
		b.run();
	}
}
