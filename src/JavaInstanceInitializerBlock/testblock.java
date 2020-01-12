package JavaInstanceInitializerBlock;

class A
{
	int speed;
	A()
	{
		System.out.println("Parent class constructor invoked");
	}
}
class testblock extends A
{
	testblock()
	{
		super();
		System.out.println("child class constructor invoked");
	}
	{System.out.println("Instance Initializer Block invoked");}
	
	public static void main(String[] args) 
	{
		testblock b1 = new testblock();
	}
}
