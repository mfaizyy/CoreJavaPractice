package HelloWorld;

public class StaticKeywordTest {
	public static void main(String[] args) {
		StaticKeyword s1 = new StaticKeyword();
		s1.rollno=100;
		s1.Name="Jason";
		System.out.println(s1.rollno+" "+s1.Name+" "+StaticKeyword.college_Name);
		
		StaticKeyword s2 = new StaticKeyword();
		s2.rollno=101;
		s2	.Name="George";
		System.out.println(s2.rollno+" "+s2.Name+" "+StaticKeyword.college_Name);
		
		
		
	}

}
