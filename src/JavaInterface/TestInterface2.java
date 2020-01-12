package JavaInterface;
//interface bank example where the implementation of getRateOfInterface is given by other banks class like sbi,axis etc.

interface Bank
{
	float getRateOfInterst();
}

class SBI implements Bank
{
	public float getRateOfInterst(){
		return(9.5f);
	}
}

class HDFC implements Bank
{
	public float getRateOfInterst(){
		return(7.6f);
	}
}
class Axis implements Bank
{
	public float getRateOfInterst(){
		return(10.00f);
		
	}
}
public class TestInterface2 
{
	public static void main(String[] args) 
	{
		Bank b = new SBI();
		System.out.println("ROI "+b.getRateOfInterst());
		Bank c = new Axis();
		System.out.println("ROI "+c.getRateOfInterst());
	}
}
