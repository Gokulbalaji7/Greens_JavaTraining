package collection_class;

import java.util.ArrayList;
import java.util.List;

public class List_Arrayyyinteger_class {

	public static void main(String[] args) {

		List<Integer> a = new ArrayList<Integer>();

		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);

		
		List<Integer> b = new ArrayList<Integer>();
		
		b.add(30);
		b.add(40);
		b.add(50);
		b.add(60);
		b.add(70);
		b.add(80);
		
		
		
		System.out.println(a);
		System.out.println(b);
		
		
// same methods in arrayyy class program
		
		
		
		
// doubt    boolean g11 = b.retainAll(a);
	    //System.out.println(g11);
		
//doubt	    Object[] g12 = a.toArray();
		//System.out.println(a);
		
		String g13 = a.toString();
		System.out.println(a);
		
		Integer g14 = a.remove(1);
		System.out.println(g14);
		System.out.println(a);
		
		boolean retainAll = a.retainAll(b); // common values in a,b
		System.out.println(a);
		
		boolean g10 = a.addAll(b);
		System.out.println(a);
		
		boolean g15 = a.removeAll(b);
		System.out.println(a);
		
		
		
		a.clear();
		System.out.println(a);
		
	}

}
