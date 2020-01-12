package JavaCallByValueAndReference;

public class callbyvalueTest 
{
	public static void main(String[] args) 
	{
		int a=10, b=20;
		System.out.println("Value of a and b before passing to the function=>");
		System.out.println(a);
		System.out.println(b);
		callByvalue c = new callByvalue();
		c.add(a, b); //actual parameter a, b passed to the function add
		System.out.println("Value of a and b affter passing to the function=>");
		System.out.println(a);
		System.out.println(b);
	}
}
