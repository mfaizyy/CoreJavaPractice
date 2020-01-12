package ObjectAndClass;
//Initializing the object through methods

public class TestStudent3 {
	public static void main(String[] args) 
	{
		Students s1 = new Students();
		Students s2 = new Students();
		s1.insertRecords(100, "Hyderabad");
		s2.insertRecords(101, "Delhi");
		s1.display();
		s2.display();
	}

}

class Students
{
	int id;
	String name;
	
	void insertRecords(int a, String b)
	{
		id=a;
		name=b;
	}
	
	void display()
	{
		System.out.println(id+" "+name);
	}
}
