package Inheritance;

public class Emp 
{
	int id;
	String name;
	Address address;
	Emp(int id, String name, Address address)
	{
		this.id=id;
		this.name=name;
		this.address=address;
	}
	void display()
	{  
		System.out.println(id+" "+name);  
		System.out.println(address.city+" "+address.state+" "+address.country);  
	}    
	public static void main(String[] args) 
	{
		Address address1=new Address("Bijnore","UP","India");
		Emp emp1=new Emp(11,"faizan",address1);
		emp1.display();
	}
}
