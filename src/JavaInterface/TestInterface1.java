package JavaInterface;
//Drawable interface example
//Interface declaration: by first user  
interface Drawable
{
	void draw();
}

//Implementation: by second user  
class Rectangle implements Drawable
{
	public void draw()
	{
		System.out.println("Drawing rectangle...");
	}
}

//Using interface: by third user  
class circle implements Drawable
{
	public void draw()
	{
		System.out.println("Drawing circle...");
	}
}

public class TestInterface1 
{
	public static void main(String[] args) 
	{
		Drawable d = new circle();  //In real scenario, object is provided by method e.g. getDrawable()

		d.draw();
	}
}
