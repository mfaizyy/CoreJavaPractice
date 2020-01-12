package AccessModifier2;
import AccessModifier1.*;
//example of default access modifier
//if not define any access modifier so bydefault it will be default

class defaultAccessM1 
{
	public static void main(String[] args) 
	{
		defaulAccessM a = new defaulAccessM();
		a.run();   //compile time error: The method run() from the type testAccess is not visible
	}
}
