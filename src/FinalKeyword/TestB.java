package FinalKeyword;
// final method can not override but can be inherited
class TestA
{
	final void run()
	{
		System.out.println("running ...");
	}
}

public class TestB extends TestA
{
	public static void main(String[] args) 
	{
		TestB b = new TestB();
		b.run();
	}
}
