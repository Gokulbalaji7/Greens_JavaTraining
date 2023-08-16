package polymorphism2;

public class Copycatclass extends Parentclass {
	
	@Override
	public void student_info(String name) {
		super.student_info(name);
	}
	
	@Override
	protected void student_info(int age) {
		super.student_info(age);
	}
	
	@Override
	public void student_info(int no, String address, int pincode) {
		super.student_info(no, address, pincode);
	}
	
	@Override
	void student_info(byte fees) {
		super.student_info(fees);
	}
	
	@Override
	public void student_info(String initial, String fathersname) {
		super.student_info(initial, fathersname);
	}
	
	private void totalstudents() {
System.out.println();
	}
	
	public static void main(String[] args) {
		
		Copycatclass object = new Copycatclass();
		 
		object.student_info("dheena");
		object.student_info(20);
		object.student_info("thangavel", "ravi");
		object.student_info(126);
		object.student_info(11, "dkm", 60802);
		object.totalstudents();
		

	}

}
