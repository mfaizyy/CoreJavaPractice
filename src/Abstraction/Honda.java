package Abstraction;
/*
 * In this example, Bike the abstract class that contains only one abstract method run. 
 * It implementation is provided by the Honda class
 */
abstract class Bike
{
	abstract void run();
}

public class Honda extends Bike
{
	void run()
	{
		System.out.println("Bike is running safely...");
	}
	public static void main(String[] args) 
	{
		Bike b = new Honda();
		b.run();
	}
}
