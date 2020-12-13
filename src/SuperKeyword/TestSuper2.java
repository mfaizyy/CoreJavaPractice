package SuperKeyword;

class Animal1
{
	void food()
	{
		System.out.println("eating...");
	}
}
class Cat extends Animal1
{
	void meaw()
	{
		System.out.println("meawing...");
	}
	void bark()
	{
		System.out.println("barking...");
	}
	void food()
	{
		System.out.println("fooding...");
	}
	void work()
	{
		System.out.println("working...");
		super.food();
		food();
	}
}

public class TestSuper2
{
	public static void main(String[] args) 
	{
		Cat c1=new Cat();
		c1.work();
	}
}
