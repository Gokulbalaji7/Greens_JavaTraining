package fully_abstract;

public class Surya_child implements Sivakumar_parent {
	// package - right click - new - interface
	// interface to class merge means use keyword implements
	// class to class or interface to interface merge means use keyword extends.
	
	
	@Override  //in override -> class level la implements use panni join pandrapo super keyword show agadhu.	
	public void bike() {
		System.out.println("ktm");
	}

	@Override
	public void car(int year) {
		System.out.println(year);
	}
	
	@Override
	public void student(String name) {
        System.out.println(name);		
	}

	@Override
	public void motor(int no, String vehicletype, int pincode) {
		System.out.println(no + "-" + vehicletype + '-'+ pincode);
	}
	
	public static void main(String[] args) {

		// this main is not use
	}

}
