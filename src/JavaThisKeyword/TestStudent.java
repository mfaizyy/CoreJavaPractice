package JavaThisKeyword;
//Program where no need of this keyword.
/*
 * It is better approach to use meaningful names for variables. 
 * So we use same name for instance variables and parameters in real time, and always use this keyword.
 */

public class TestStudent 
{  
	public static void main(String[] args) 
	{
		Student s1= new Student(10, "wipro", 10.5f);
		Student s2= new Student(12, "tcs", 11.5f);
		s1.display();
		s2.display();
	}
}

class Student
{  
	int rollno;  
	String name;  
	float fee;  
	Student(int r,String n,float f)
	{  
		rollno=r;  
		name=n;  
		fee=f;  
	}  
	void display()
	{
		System.out.println(rollno+" "+name+" "+fee);
	}
}