package Collection;//list is ordered but set is unordered

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> d=new ArrayList <String>();//Arraylist class
	d.add("myself");
	d.add("teacher");
	d.add("mother");
	d.add("sister");
	d.add("daughter");
	d.add("wife");
	System.out.println(d);
	
	//list2
	ArrayList<String> s=new ArrayList <String>();
	s.add("farha");
	s.add("Jaseem");
	System.out.println(s);
	d.addAll(s);
	System.out.println(d);
	s.addAll(d);
	System.out.println(s);
	System.out.println(s.isEmpty());
	}

}
