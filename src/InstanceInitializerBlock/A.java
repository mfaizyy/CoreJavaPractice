package InstanceInitializerBlock;
//Simple program to show instance initializer block 

public class A 
{
	
	int speed;
	A()
	{
		System.out.println("Parent class constructor "+speed);
	}
	
	{speed=100;};   //Instance initializer block
public static void main(String[] args) 
	{
		A a1= new A();
		
	}
}
