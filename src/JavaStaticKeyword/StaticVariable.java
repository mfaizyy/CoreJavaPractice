package JavaStaticKeyword;
//Program of static variables

public class StaticVariable 
{
	int rollno;
	String Name;
	static String College="VKIT";
	
	StaticVariable(int rollno, String Name)
	{
		this.rollno=rollno;
		this.Name=Name;
	}
	
	
	void display()
	{
		System.out.println(rollno+" "+Name+" "+College);
	}
	
	public static void main(String[] args) 
	{
		StaticVariable s1 = new StaticVariable(100,"lenovo");
		StaticVariable s2  = new StaticVariable(101,"nokia");
		s1.display();
		s2.display();
		
	}

}
