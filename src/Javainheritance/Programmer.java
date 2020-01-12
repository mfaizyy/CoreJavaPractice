package Javainheritance;
//Single Example of inheritance
class Employee  //Parent class or super class
{
	int salary=10000;
}




public class Programmer extends Employee   //Programmer is child class or sub class
{
	int bonus=5000;
	public static void main(String[] args) 
	{
		Programmer p=new Programmer();
		System.out.println("Salary "+p.salary);
		System.out.println("Bonus "+p.bonus);
	}
}
