package JavaSuperKeyword;
//Program to call immediate parent class instance variables
class Animal
{
	String color="white"; //instance variable
}

class Dog extends Animal
{
	String color="black";  //local variable
	void printcolor()
	{
		System.out.println(color);
		System.out.println(super.color); //here super will call parent class variable.
	}
}

public class TestSuper1 
{
	public static void main(String[] args) 
	{
		Dog d=new Dog();
		d.printcolor();
	}
}
