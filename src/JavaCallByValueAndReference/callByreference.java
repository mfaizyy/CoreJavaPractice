package JavaCallByValueAndReference;

public class callByreference 
{
	int data=10;
	void change(callByreference op)
	{
		op.data=op.data+100; //changes will be in the instance variable
	}
	public static void main(String[] args) 
	{
		callByreference op = new callByreference();
		//callByreference op;
		System.out.println("before change "+op.data);  
		op.change(op);//passing object  
		System.out.println("after change "+op.data);  
		
	}
}
