package JavaPolymorphism;
//Runtime polymorphism where the data members can not override.

class bijnor
{
	int population=1000;
}

public class city extends bijnor
{
	int population=2000;      //data member can not override
	public static void main(String[] args) 
	{
		bijnor bj=new city();
		System.out.println(bj.population);
	}
}
