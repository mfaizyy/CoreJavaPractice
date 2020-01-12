package JavaInterface;
//Multiple inheritance by java interface

interface Drawable2
{
	public void draw();
}
interface showable
{
	public void show();
	
}
public class TestMultiInheritance implements Drawable2,showable  //Multiple inheritance
{
	public void draw(){System.out.println("Hello");}  
	public void show(){System.out.println("Welcome");}  

	public static void main(String[] args) 
	{
		TestMultiInheritance t = new TestMultiInheritance();
		t.draw();
		t.show();
	}
}
