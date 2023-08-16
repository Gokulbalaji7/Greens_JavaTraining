

//sample



package polymorphism2;

public class Method_overridng extends Parentclass {

	private void raid() {
		System.out.println("biker");
	}

	private void camp(int pincode) {
		System.out.println(pincode);
		// idhula nama string or int edhu koduthalum,syso la um adha apdiye kodukanum
		// apo dhan adha nama main la cal pandra apo name or values koduka mudium
	}

	private void count(int numbers) {
		System.out.println("numbers");
		// nama int or string koduthalum, syso la double semicolen ulla edhu
		// irundhaum adhedhan print agum
	}

	private void count() {
		System.out.println("house");
		//idhu nama normal aa method create pani main la cal pandrom, see privious method in top side
	}

// normal aa parent method aa child la override panna super keyword varum 
	
	@Override
	public void student_info(int no, String address, int pincode) {
		// TODO Auto-generated method stub
		super.student_info(no, address, pincode);
	}
	
	public static void main(String[] args) {

		Method_overridng og = new Method_overridng();

		og.raid();
		og.camp(608001);
		og.count(608005);
		og.count();
		og.student_info(20, "addressnagar", 602222);
		og.student_info("keyboard");
		og.student_info(11);

	}

}
