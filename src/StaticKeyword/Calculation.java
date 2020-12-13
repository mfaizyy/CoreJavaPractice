package StaticKeyword;

public class Calculation {
	
	 static int cube(int x) {
		return x*x*x;	
	}
	 
	 int cube1(int y) {
		return y*y*y;	
	}
	
	public static void main(String[] args) {
		Calculation result1 = new Calculation();   //object has created for cube1 
		
		int cube1value = result1.cube1(5);
		
		int result = Calculation.cube(5); //calling the static method direct without creating the instance of the class
		
		System.out.println("The result is:- "+result);
		
		System.out.println("The result of cube1:- "+cube1value);
	}

}
