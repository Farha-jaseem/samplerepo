package Abstraction;

public class abstractChild extends abstractionParent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		abstractChild obj=new abstractChild();
		obj.add();
		obj.display();
		obj.display1();
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
	}
public void display()
{
	System.out.println("non abstract method");}

@Override
public void display1() {
	// TODO Auto-generated method stub
	System.out.println("another abstract method");
}
}
