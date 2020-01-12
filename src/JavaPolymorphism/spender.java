package JavaPolymorphism;
//Simple program for Runtime polymorphism
//Runtime polymorphism or dynamic dispatch method

class bike
{
	void run()
	{
		System.out.println("bike is running...");
	}
}

public class spender extends bike
{
	void run()
	{
		System.out.println("bike is running safely...");
	}
	public static void main(String[] args) 
	{
		bike b = new spender(); //Upcasting: Parent class reference variable refers child class objects. 
		b.run();
	}
}
