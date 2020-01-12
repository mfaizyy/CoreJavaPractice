package MethodOverriding;
//Method overriding real time example
class bank
{
	int getRateOfInterest()
	{
		return 0;
	}
}
class HDFC extends bank
{
	int getRateOfInterest()
	{
		return 9;
	}
}
class SBI extends bank
{
	int getRateOfInterest()
	{
		return 6;
	}
}
class AXIS extends bank
{
	int getRateOfInterest()
	{
		return 7;
	}  
}  
public class Test1 
{
	public static void main(String[] args) 
	{
		HDFC h=new HDFC();
		SBI s=new SBI();
		AXIS a=new AXIS();
		System.out.println("Rate of interst HDFC:- "+h.getRateOfInterest());
		System.out.println("Rate of interst SBI :- "+s.getRateOfInterest());
		System.out.println("Rate of interst AXIS:- "+a.getRateOfInterest());
	}
}
