package Interfaceex;

public class InterfacemultipleInheritance implements Printable,showable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfacemultipleInheritance obj=new InterfacemultipleInheritance();
		obj.print();
		obj.print1();
	}

	@Override
	public void print1() {
		// TODO Auto-generated method stub
		
			System.out.println("show display");
		
	}

	@Override
	public void print() {
		
			System.out.println("print display");
		
	}

}
