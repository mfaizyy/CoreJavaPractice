package Ifelse;

public class Marks {
	public static void main(String[] args) {
		int marks= 65;
		if (marks<50)
		{
			System.out.println("fail");
		}
		
		else if(marks>=60&&marks<70)
		{
			System.out.println("C grade");
		}
		
		else
		{
			System.out.println("Not rated");
		}
	}

}
