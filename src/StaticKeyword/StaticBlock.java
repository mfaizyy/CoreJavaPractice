package StaticKeyword;

public class StaticBlock {
	
	
	public static void main(String[] args) 
	{
		System.out.println("Main method is invoked");
	}
	
	static 
	{
		System.out.println("Static block invokedd");//static block invoked before the main method at time of class loading
	}

}
