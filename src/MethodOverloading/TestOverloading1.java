package MethodOverloading;
//Method overloading: changing number of arguments

public class TestOverloading1 
{
	static int add(int a, int b)
	{
		return a+b;
	}
	
	static int add(int a, int b, int c)
	{
		return a+b+c;
	}
	public static void main(String[] args) 
	{
		System.out.println(TestOverloading1.add(10, 20));
		System.out.println(TestOverloading1.add(10, 10, 20));
	}
}
