package polymorphism.com;

public class Method_overldng_sample {

	
	private void student_info(String name) {
System.out.println(name);
	}
	
	private void student_info(int age) {
System.out.println(age);
//doubt in int or short
	}

	private void student_info(char gender) {
System.out.println(gender);
	// doubt in char or string 
		}
	
	private void student_info(int no ,String address, int pincode) {
System.out.println(no +" "+ address+"-"+pincode);
// doubt in int no or short no
	}
	
	private void student_info(byte fees) {
System.out.println(fees);
	}
	
	private void student_info(String initial, String fathersname) {
System.out.println(initial +" "+ fathersname);
	}
	
	private void student_info(String bank, long accountnumber) {
System.out.println(bank+':'+ accountnumber);
	}
	
	public static void main(String[] args) {

		 Method_overldng_sample obj = new  Method_overldng_sample();
				
		obj.student_info("Gokul");
		obj.student_info(30);
		obj.student_info("Male");
		obj.student_info(14, "mk nagar", 608001);
		obj.student_info(111);
		obj.student_info("T Ravi");
		obj.student_info("hdfc", 1234567890987654321l);
	}	
}

