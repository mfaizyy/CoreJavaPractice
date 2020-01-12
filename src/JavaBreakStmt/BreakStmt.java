package JavaBreakStmt;
//This program prints number from 1 to 5

public class BreakStmt {
public static void main(String[] args) {
	for(int i=1; i<=10; i++)
	{
		System.out.println(i);
		if(i==5)
		{
			break;	
		}
	}
}
}
