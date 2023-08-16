package collection_class;

import java.util.ArrayList;
import java.util.List;

public class List_Arrayyyobject_class {

	public static void main(String[] args) {

		List<Object> g = new ArrayList<Object>();
	
		
		g.add(10);
		g.add(10);
		g.add(1, 20);
		g.add("Gokul");
		g.add(40);
		g.add(2, 30);
		g.add(null);
		g.add(null);
		g.add(40);
		
		
		System.out.println(g);
		
	
		int g1 = g.size();
		System.out.println(g1);
		
// to find index value from length or size it has 2 types see below	
		
		int indexvalue = g.size()-1;
		System.out.println(indexvalue);
		int a = g1 -1;
		System.out.println(a);
		
		int g2 = g.indexOf(10);
		System.out.println(g2);
		int g3 = g.indexOf(20);
		System.out.println(g3);
		
		int g4 = g.lastIndexOf(40);
		System.out.println(g4); 
		
		boolean g5 = g.contains(40);
		System.out.println(g5);
		boolean g6 = g.contains(90);
		System.out.println(g6);
		
        Object g7 = g.get(4);
	    System.out.println(g7);
		
        Object g8 = g.set(0, 50);
		System.out.println(g);
		
		boolean g9 = g.isEmpty();
		System.out.println(g9);
	
		
// important shortcut online example below
		
// System.out.println(g.contains(90));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
