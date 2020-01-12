package JavaInterface;
//A class implements interface but one interface extends another interface.

interface printable3
{
	void printing();
}

interface showing extends printable3
{
	void showing();
}

public class TestMultiInheritance3 implements showing
{
	public void printing()
	{
		System.out.println("Hello I got release!");
	}
	public void showing()
	{
		System.out.println("hello in top gear!");
	}
	public static void main(String[] args) 
	{
		TestMultiInheritance3 t3 = new TestMultiInheritance3();
		t3.printing();
		t3.showing();
	}
}
