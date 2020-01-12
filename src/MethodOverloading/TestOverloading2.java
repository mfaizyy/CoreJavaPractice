package MethodOverloading;
//Method overloading: by changing the data type of the variables

public class TestOverloading2
{
	static  int add(int a, int b)
	{
		return a+b;
	}
	static double add(double a, double b, double c)
	{
		return a+b+c;
	}
public static void main(String[] args) 
{
	System.out.println(TestOverloading2.add(100, 10));
	System.out.println(TestOverloading2.add(10, 12, 10));
}
}
