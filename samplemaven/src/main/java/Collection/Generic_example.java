package Collection;

import java.util.ArrayList;
import java.util.List;

public class Generic_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String> d=new ArrayList <String>();//generic type colllection
d.add("red");
d.add("black");
d.add("blue");
d.add("orange");
d.add("white");
d.add("red");//add()
System.out.println(d);
d.set(1, "darkred");//set()
System.out.println(d);
System.out.println(d.indexOf("red"));//indexOf
System.out.println(d.lastIndexOf("red"));//lastindexof()
System.out.println(d.get(3));//get()
d.remove(3);
System.out.println(d);
System.out.println(d.contains("white"));
System.out.println(d.contains("pink"));
System.out.println(d.contains("ornge"));


	}

}
