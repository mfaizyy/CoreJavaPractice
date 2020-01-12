package ObjectAndClass;
//Initializing the object with reference 

public class TestStudent2 
{
	public static void main(String[] args) 
	{
		Student2 s2 = new Student2();
		s2.mob=704275377;
		s2.sp="Airtel";
		System.out.println(s2.mob);
		System.out.println(s2.sp);
	}

}

class Student2
{
	int mob;
	String sp;
}
