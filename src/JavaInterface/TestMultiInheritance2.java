package JavaInterface;
//Interface example with multiple inheritance 

interface printable2
{
	void take();
}
interface design
{
	void take();
}
public class TestMultiInheritance2 implements printable2, design //multiple inheritance 
{
	public void take()
	{
		System.out.println("Get out of here!");
	}
	public static void main(String[] args) 
	{
		TestMultiInheritance2 m = new TestMultiInheritance2();
		m.take();
	}
}
