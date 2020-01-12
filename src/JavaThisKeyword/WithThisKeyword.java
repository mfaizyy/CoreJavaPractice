package JavaThisKeyword;
/*
 If local variables(formal arguments) and instance variables are different, there is no need to use this keyword
 */

public class WithThisKeyword {
	int id;
	String name;
	
	WithThisKeyword(int id, String name)
	{
		this.id=id;		// Here this keyword tell instance and local variables
		this.name=name;
		
	}
	
	void display()
	{
		System.out.println(id+" "+name);
	}

	public static void main(String[] args) 
	{
		WithThisKeyword s1 = new WithThisKeyword(100,"Delhi");
		s1.display();
		
	}
}