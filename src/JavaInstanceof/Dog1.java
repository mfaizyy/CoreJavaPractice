package JavaInstanceof;
//Example to show whether object d is an instance of parent class or not.

class Animal{}
	
public class Dog1 extends Animal
{
	public static void main(String[] args) 
	{
		Dog1 d = new Dog1();
		System.out.println(d instanceof Animal);
	}
}
