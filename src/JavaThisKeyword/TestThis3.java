package JavaThisKeyword;
//this(): to invoke current class constructor
class B
{
	B()
	{
		this(5);  ////this(): to invoke current class constructor
		System.out.println("Hello B");
	}
	
	B(int x)
	{
		System.out.println(x);
	}
}



public class TestThis3 
{
	public static void main(String[] args) 
	{
		B b1 = new B();	
	}
	
}
