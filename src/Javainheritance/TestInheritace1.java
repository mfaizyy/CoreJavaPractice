package Javainheritance;
//Single level inheritance

class Animal	//Parent class	
{
	void eat()
	{
		System.out.println("eating...");
	}
}

class Dog extends Animal     //Child class
{
	void bark()
	{
		System.out.println("barking...");
	}
}

public class TestInheritace1   //Driver class
{
	public static void main(String[] args) 
	{
		Dog d=new Dog();
		d.eat();
		d.bark();
	}
}
