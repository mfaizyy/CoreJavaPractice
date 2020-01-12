package MethodOverriding;
//Method overriding 
//method must have the same name and same return type as its parent class have.
//Must have the IS-A relationship (inheritance)
class veichle
{
	void run()
	{
		System.out.println("Veichle is runnig...");
	}
}

public class bike extends veichle
{
	void run()
	{
		System.out.println("Veichle is running safely...");
	}
	public static void main(String[] args) 
	{
	 	bike v=new bike();
	 	v.run();
	}
}
