package ObjectAndClass;
//Calling object of Student1 class when main is in another class

class Student1{
	int rNo=100;
	String address="Hyderabad";
}

public class TestStudent {
	public static void main(String[] args) {
		Student1 s1 = new Student1();
		System.out.println(s1.rNo);
		System.out.println(s1.address);
	}

}



