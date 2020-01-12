package JavaConstructor;
//Constructor overloading in java,
//Java differentiate in constructor by taking account number of parameters. 
public class Student5 
{
	int rollNo;
	String name;
	String addr;
	Student5(int rollNo, String name)
	{
		this.rollNo=rollNo;
		this.name=name;
	}
	Student5(int rollNo, String name, String addr)
	{
		this.rollNo=rollNo;
		this.name=name;
		this.addr=addr;
	}
	void display()
	{
		System.out.println(rollNo+" "+name+" "+addr);
	}
	public static void main(String[] args) 
	{
		Student5 s1 = new Student5(100,"Hyd");
		Student5 s2 = new Student5(101,"Hyderabad","Gachibowli");
		s1.display();
		s2.display();
				
	}
}
