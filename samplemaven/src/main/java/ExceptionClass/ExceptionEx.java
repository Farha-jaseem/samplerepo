package ExceptionClass;

public class ExceptionEx
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
int a=10;
int b=0;
//System.out.println("hi before");//to check then code is working fine

try {
	int c=a/b;//exception in 9th line
	System.out.println(c);
}
/*catch(ArithmeticException e)
{
	b=5;//changing value of b to handle the arithmetic exception}
int d=a/b;
	System.out.println(d);
	System.out.println(e);//exception show
			}*/
			
//System.out.println("hi after");//to check then code is working fine after exception

	
finally
 {
	System.out.println("end of the exception");

 }
}                          
}
	
