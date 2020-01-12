package JavaForLoop;
/**
 * This is Java labled loop:
output:
1 1
1 2
1 3
2 1
 * @author MO605234
 *
 */

public class JavalableLoop 
{
	public static void main(String[] args) 
	{
		aa:
			for(int a=1; a<=3; a++)
			{
				bb:
					for(int b=1; b<=3; b++)
				{
					if(a==2&&b==2)
					{
						break aa;
					}
					
					System.out.println(a+" "+b);
						
				}
					
	          
			}
	}

}
