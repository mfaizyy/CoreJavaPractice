package JavaThisKeyword;
//this(): to invoke current class constructor
class A
{
	A()
	{
		System.out.println("hello a");
	}
	
	A(int x)
	{
		this();   //Calling default constructor from parameterized constructor:
		System.out.println(x);
	}
}

public class TestThis2 
{
	public static void main(String[] args) 
	{
		A a1= new A(12);
		
	}
}
