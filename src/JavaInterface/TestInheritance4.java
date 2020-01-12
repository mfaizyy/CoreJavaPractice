package JavaInterface;
//Default method in interface
interface npower
{
	void run();
	default void pagal()
	{
		System.out.println("You are pagal!");
	}
}
public class TestInheritance4 implements npower
{
	public void run(){System.out.println("hello npower!");}
	public static void main(String[] args) 
	{
		TestInheritance4 t4 = new TestInheritance4();
		t4.run();
		t4.pagal();
	}
}
