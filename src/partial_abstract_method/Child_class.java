package partial_abstract_method;

public class Child_class extends Parent_class {

	
// imp	

// normal aa parent method aa child la override panna super keyword varum 
// parent abstract method aa child class la override pandrapo super nu keyword varadhu.

	public void barath() {
		System.out.println("univer");
	}

	@Override
	public void university() {
		
		System.out.println("madras UNIVERS");
	}

	@Override
	public void degree() {
		System.out.println("mechanical");
		

	}

	@Override
	public void project() {
		System.out.println("space project");

	}

	public static void main(String[] args) {

// object cal pandradhu work agadhu because of abstract keyword using in parent class
// then parentclass should be extends in child class so only.

	}

}
