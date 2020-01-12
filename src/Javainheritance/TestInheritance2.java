package Javainheritance;
// Multilevel inheritance
class Animal2
{
	void eat()
	{
		System.out.println("eating.....");
	}
}

class Dog2 extends Animal2
{
	void bark()
	{
		System.out.println("barking...");
	}
}

class babydog extends Dog2
{
	void weep()
	{
		System.out.println("weeping...");
	}
}


public class TestInheritance2 {
	public static void main(String[] args) 
	{
		babydog d= new babydog();
		d.eat();
		d.bark();
		d.weep();
	}
}
