package InstanceInitializerBlock;
// Progeram to show instance initializer block with two constructor
class testsuper1 
{
	testsuper1()
	{
		System.out.println("parent class constructor");
	}
}
class super1 extends testsuper1
{
	super1()
	{
		super();
		System.out.println("child class constructor");
	}
	super1(int a)
	{
		super();
		System.out.println("child class constructor "+a);
	}
	{System.out.println("Instance Initializer block invoked");};
}
public class test1
{
	public static void main(String[] args) 
	{
		super1 s = new super1();
		super1 s1 = new super1(5);
		
	}
}

