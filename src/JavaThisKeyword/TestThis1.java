package JavaThisKeyword;
//this(): to invoke current class method
class test2
{
	void m1()
	{
		System.out.println("hello m1");
	}
	
	void n1()
	{
		System.out.println("hello n1");
		this.m1();   //compiler automatically adds this keyword while invoking the method
	}
}

public class TestThis1 {
	public static void main(String[] args) 
	{
		test2 t1 = new test2();
		t1.n1();
	}

}
