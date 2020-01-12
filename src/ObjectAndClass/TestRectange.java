package ObjectAndClass;
//This program shows how to create two objects of same type.

public class TestRectange {
	public static void main(String[] args) 
	{
		Rectangle r1 = new Rectangle(), r2 = new Rectangle(); //Creating two object of the same type.
		r1.inster(10, 15);
		r2.inster(4, 6);
		r1.CalculateArea();
		r2.CalculateArea();
	}

}

class Rectangle
{
	int height;
	int width;
	
	void inster(int h, int w)
	{
		height=h;
		width=w;
	}
	
	void CalculateArea()
	{
		System.out.println("The area of rectange: "+height*width);
	}
}