package JavaSuperKeyword;
//program to show, super can be used to call the parent class constructor.
class Animal
{
	Animal()    //Parent class constructor
	{
		System.out.println("Parent class constructor");
	}
}
class cat extends Animal
{
	cat()			//Child class constructor.
	{
		super();     // calling parent class constructor.
		System.out.println("Child class constructor");
	}
}
public class TestSuper3 
{
	public static void main(String[] args) 
	{
		cat c=new cat();  // creating the objec of child class and calling child class constructor.
	}
}
