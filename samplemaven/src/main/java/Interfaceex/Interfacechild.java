package Interfaceex;

public class Interfacechild implements InterfaceParent{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interfacechild obj=new Interfacechild();
		obj.display();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("interface class");
	}

}
