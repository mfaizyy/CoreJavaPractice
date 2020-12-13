package StaticKeyword;
//Since instance variable gets the memory at the time of object creation, 
//each object will have the copy of the instance variable, if it is incremented, 
//it won't reflect to other objects. So each objects will have the value 1 in the count variable.

public class CounterWithoutStatic {
	int count=0;//will get memory once when the instance is created.
	
	CounterWithoutStatic()
	{
		count++;
		System.out.println(count);
	}
	
	public static void main(String[] args) 
	{
		CounterWithoutStatic c1 = new CounterWithoutStatic();
		CounterWithoutStatic c2 = new CounterWithoutStatic();
		CounterWithoutStatic c3 = new CounterWithoutStatic();
		
	}
	

}
