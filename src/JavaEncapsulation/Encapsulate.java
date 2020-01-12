package JavaEncapsulation;
//Example of encapsulation

public class Encapsulate 
{
	private int rollno;
	private String name;
	
	//get methods to print value 
	public int getrollno()
	{
		return rollno;
	}
	public String getname()
	{
		return name;
	}
	
	//set methods to get value as input
	public int setrollno(int rollno)
	{
		return this.rollno=rollno;
	}
	public void setname(String name)
	{
		this.name=name;
	}
}
