package FibonacciSeries;
//This program print the 
class FibonacciSeriesWithRecurssion
{
	static int n1=0,n2=1,n3;
	static void fibonacci(int count)
	{
		if(count>0) // count to stop when count will be 0
		{
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.print(" "+n3);
			fibonacci(count-1);
		}
		
	}
	public static void main(String[] args) 
	{
		int count=8;
		System.out.print(n1+" "+n2); //Printing 0 and 1
		fibonacci(count-2); //0 and 1 already printing, to print till need to to do -2
		
	}
}
