package ObjectAndClass;
//Creating the class object and calling data member with default value

public class Student {
	int rollno;
	String name;
	public static void main(String[] args) {
		Student s1= new Student();
		System.out.println(s1.rollno); //Default value for int is 0
		System.out.println(s1.name);	//Default value for String is null
	}

}
