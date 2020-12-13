package ThisKeyword;
//Reusing the constructor
class c
{
	int rollno;  
	String name,course;  
	float fee;  
	c(int rollno,String name,String course)
	{  
		this.rollno=rollno;  
		this.name=name;  
		this.course=course;  
	}  
	c(int rollno,String name,String course,float fee)
	{  
		this(rollno,name,course);//Rule: Call to this() must be the first statement in constructor.
		this.fee=fee;  
	}  
	void display(){System.out.println(rollno+" "+name+" "+course+" "+fee);}  
} 


public class TestThis4
{  
	public static void main(String args[])
	{  
		c s1=new c(111,"ankit","java");  
		c s2=new c(112,"sumit","java",6000f);  
		s1.display();  
		s2.display();  
	} 
}
