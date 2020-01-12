package JavaInterface;
//static method in java interface.
interface pagalhai
{
	void tupagal();
	static int cube(int x){
		return x*x*x;
	}
}
class hihello implements pagalhai
{
	public void tupagal()
	{
		System.out.println("Tu pagal nahi hai.");
	}
}

public class TestInterfaceStatic 
{
	public static void main(String[] args) 
	{
		pagalhai p = new hihello();
		p.tupagal();
		System.out.println(pagalhai.cube(5));
	}
}
