package ThisKeyword;
//Program without this keyword

public class WithOutThis {
	int id;
	String name;
	
	WithOutThis(int id, String name)
	{
		id=id;		// compiler will confuse here which is instance variable and which one is local variable or parameter
		name=name;
		
	}
	
	void display()
	{
		System.out.println(id+" "+name);
	}

	public static void main(String[] args) 
	{
		WithOutThis s1 = new WithOutThis(100,"Delhi");
		s1.display();
		
	}
}
