package Constructor;
//Copying values of one object into another by assigning the objects values to another object. 
//In this case, there is no need to create the constructor.
public class Student7 {
	int idNo;
	String Name;
	
	Student7(int idNo, String Name)
	{
		this.idNo=idNo;
		this.Name=Name;
	}

	Student7(){}
	
	void Display()
	{
		System.out.println(idNo+" "+Name);
	}
	
	public static void main(String[] args) 
	{
		Student7 s1 =  new Student7(111, "wipro");
		s1.Display();
		Student7 s2 =  new Student7();
		s2.idNo=s1.idNo;
		s2.Name=s1.Name;
		s2.Display();
		
	}
}
