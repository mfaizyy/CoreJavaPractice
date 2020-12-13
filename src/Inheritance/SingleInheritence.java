package Inheritance;
//This program is about single level inheritence 

class Animal{
	void eating() {System.out.println("Eating.......");}
}

class Dog extends Animal{
	void barking() {
		System.out.println("Barking........");
	}
}


public class SingleInheritence {
	public static void main(String[] args) {
		Dog d = new Dog();
		d.barking();
		d.eating();
	}

}
