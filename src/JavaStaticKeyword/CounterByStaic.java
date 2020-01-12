package JavaStaticKeyword;
//will get the memory only once, if any object changes the value of the static variable, 
//it will retain its value

public class CounterByStaic 
{
	static int count = 0; //will get memory only once and retains its value
	
	CounterByStaic()
	{
		count++;
		System.out.println(count);
	}
	
	public static void main(String[] args)
	{
		CounterByStaic c1 = new CounterByStaic();
		CounterByStaic c2 = new CounterByStaic();
		CounterByStaic c3 = new CounterByStaic();
		
	}
	
}
