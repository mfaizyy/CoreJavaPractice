package FibonacciSeries;

public class FibonacciSeriesPrint

{

       public static void main(String[] args)

       {

              int n1=0, n2=1, n3, count=10;

              System.out.println("Fibonacci series till "+count+" counts:" );

              System.out.print(n1+" "+n2);

             

              for(int i=2; i<10; i++) //i<10 because the fibonacci count should be 10. 0,1 already printing in first line.

              {

                     n3=n1+n2;

                     System.out.print(" "+n3);

                     n1=n2;

                     n2=n3;

              }

       }

}