package Constructor;
//Example of default constructor that displays the default values
//Default values in case of int is 0, String null, float 0.0

public class DefaultValue {
	int id;
	String name;
	float fee;
	
	void display()
	{
		System.out.println(id+" "+name+" "+fee);
	}
	
	public static void main(String[] args) 
	{
		DefaultValue s1 = new DefaultValue();
		DefaultValue s2= new DefaultValue();
		s1.display();
		s2.display();
		
	}
	

}
