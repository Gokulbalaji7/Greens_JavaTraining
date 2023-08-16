package types_of_variables;

public class Local_variable {
	

	private void engineer() {

		String name = "mechanical";
		name = "gokul";
		// it will take the last we given value
		System.out.println(name + '.');
		
		String name1 = "Civil";
	    name1 = "balaji";
	    System.out.println(name1);

		int year = 8888; 
		year = 77777;
		System.out.println(year);

	}

	public static void main(String[] args) {

		Local_variable obj = new Local_variable();

		obj.engineer();

	}

}