package MethodOverriding;
//problem without method overriding.
//Without method overriding we can not give the specific implementation to a method 

class veichle1
{
	void run()
	{
		System.out.println("Veichle is runing...");
	}
}

public class bike1 extends veichle1
{
	public static void main(String[] args) 
	{
		bike1 v=new bike1();
		v.run();
	}
}
