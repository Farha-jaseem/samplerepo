package ExceptionClass;

public class ThrowEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int age=17;
if(age>18)
{
	System.out.println("eligible");
	}
else
{
	throw new ArithmeticException("age under 18");}
	}

}
