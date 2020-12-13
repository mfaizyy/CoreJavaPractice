package FinalKeyword;
//Simple example of final keyword where the value of final variable can not be changed of final variable

/*
 final keyword variable value can not changed, it can be constant
 final method can not be override
 final class can not be inherited 
 */
public class Bike 
{
	final int speedlimit=100;
	void run()
	{
		speedlimit=150;  //Can not change the value 
	}
	public static void main(String[] args) 
	{
		Bike b = new Bike();
		b.run();
		System.out.println("speed of the bike is:- "+b.speedlimit);
	}
}
