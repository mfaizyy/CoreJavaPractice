package Constructor;
//Parameterized constructor to initialize objects, we can define any number of parameters.

public class Constructor1 
{
	int id;
	String name;
	
	Constructor1(int id, String name)//Parameterized constructor two parameters
	{
		this.id=id;
		this.name=name;
	}
	
	void display()
	{
		System.out.println(id+" "+name);
	}
	
	public static void main(String[] args) 
	{
		Constructor1 c1 = new Constructor1(605234, "Faizan");
		c1.display();
		
	}
	
	
}
