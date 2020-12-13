package ForLoop;
//This program prints number from 1 to 10

public class JavaDoWhileLoop {
	public static void main(String[] args) {
		int i=1;
		do
		{
			System.out.println(i);
			i++;
			//i--;    if put this then program print 1 for infinite time
		}while(i<=10);
	}

}
