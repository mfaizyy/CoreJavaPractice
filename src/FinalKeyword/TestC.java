package FinalKeyword;
//Example of initialize final blank variable.
//we can initialize final blank variable only in constructor.

public class TestC 
{
	final int speedlimit;
	TestC()
	{
		speedlimit=100;
		System.out.println(speedlimit);
	}
	public static void main(String[] args) 
	{
	    new TestC();
	}
}
