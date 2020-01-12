package JavaEncapsulation;

public class test 
{
	public static void main(String[] args) 
	{
		Encapsulate obj = new Encapsulate();
		obj.setRollno(101);
		obj.setName("faizan");
		obj.setSize(7);
		obj.setAge(27);
		System.out.println("The name of geek is:- "+obj.getName());
		System.out.println("The age of geek is:-"+obj.getAge());
		System.out.println("The roll number of geek is:-"+obj.getRollno());
		System.out.println("The size of geek is:-"+obj.getSize());
		
	}
}
