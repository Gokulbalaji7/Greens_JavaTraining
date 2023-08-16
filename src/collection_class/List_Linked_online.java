package collection_class;

import java.util.LinkedList;

public class List_Linked_online {

	public static void main(String[] args) {

		LinkedList g = new LinkedList();

		
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
		
//linked list methods
		
		System.out.println("linked list methods");
		
      	g.addFirst(100);
      	System.out.println(g);
		
		g.addLast(200);
		System.out.println(g);
		
		Object pollFirst = g.pollFirst(); // or removefirst same process
		System.out.println(g);
		
		Object pollLast = g.pollLast(); // or removelast same process
		System.out.println(g);
		
		Object clone = g.clone();
		System.out.println(g);
		
		
		
		
//array list methods also allowed in linked list
		
System.out.println("array list methods also allowed in linked list");	
		
		int g1 = g.size();
		System.out.println(g1);

// to find index value from length or size it has 2 types see below

		int indexvalue = g.size() - 1;
		System.out.println(indexvalue);
		int a = g1 - 1;
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

// important shortcut for some methods online example below

// System.out.println(g.contains(90));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
