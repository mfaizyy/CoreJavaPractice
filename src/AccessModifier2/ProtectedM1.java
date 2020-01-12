package AccessModifier2;
import AccessModifier1.*;
//Example of protected access modifier
//provide the acces with the package and outside the package but through inheritance only

public class ProtectedM1 extends ProtectedM 
{
	public static void main(String[] args) 
	{
		ProtectedM1 obj = new ProtectedM1();
		obj.access();
	}
}
