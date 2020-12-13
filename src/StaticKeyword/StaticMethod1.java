package StaticKeyword;

public class StaticMethod1 {
	int rollno;
	String name;
	static String college="Vkit";
	
	static void change()
	{
		college="IIT";
	}
	
	StaticMethod1(int rollno, String name)
	{
		this.rollno=rollno;
		this.name=name;
	}
	
	void display()
	{
		System.out.println(rollno+" "+name+" "+college);
	}
	
	public static void main(String[] args) 
	{
		StaticMethod1 c1= new StaticMethod1(10, "pk");
		StaticMethod1 c2= new StaticMethod1(11, "khaPk");
		StaticMethod1.change();
		c1.display();
		c2.display();
	}

}
