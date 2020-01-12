package PrimeNumber;

import java.util.Scanner;

public class PrimeNumberList 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any value");
		int num = scan.nextInt();
		System.out.println(); //to give next line space
		for(int i=2; i<=num; i++)
		{
			for(int j=2; j<=i; j++)
			{
				if(j==i)
				{
					System.out.println(i);
				}
				if(i%j==0)
				{
					break;
				}
			}
		}
	}
}
