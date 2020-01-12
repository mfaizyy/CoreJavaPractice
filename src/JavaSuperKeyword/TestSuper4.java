package JavaSuperKeyword;
//Program to show: super() is added in each class constructor automatically by compiler if there is no super() 

class Animal2
{
	Animal2()
	{
		System.out.println("Parent class constructor");
	}
}
class cat2 extends Animal2
{
	cat2()
	{
		//Here compiler will add super() to call the parent class construtor.
		System.out.println("Child class constructor");
	}
}
public class TestSuper4 
{

	public static void main(String[] args) 
	{
		cat2 c = new cat2();
	}
}
