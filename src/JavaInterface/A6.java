package JavaInterface;
//simple example of interface, here printable intereface has one method and its implemention is given by A6 class

interface printable
{
	void run();
}

public class A6 implements printable 
{
	public void run()
	{
		System.out.println("Printing...");
	}
	public static void main(String[] args) 
	{
		A6 a = new A6();
		a.run();
	}
}
