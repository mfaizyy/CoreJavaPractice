package PrimeNumber;

import java.util.Scanner;

//<==========================================================>

//This program checks the given number is prime or not.

public class PrimeNumberCheck
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in); // to take user input at runtime
		System.out.println("Enter any Number:");
		int num = scan.nextInt(); //telling that input is a type of int and store the value in num variable
		boolean prime = true;  //Boolean type variable
		for (int i=2; i<num; i++)
		{
			if(num%i==0)
			{
				prime=false;
				
			}
		}
		if(prime==false)
		{
			System.out.println(num+" Is not Prime");
		}
		else if(prime==true)
		{
			System.out.println(num+" Is Prime");
		}
	}
}