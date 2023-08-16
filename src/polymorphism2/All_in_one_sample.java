package polymorphism2;

public class All_in_one_sample extends Parentclass {

	private void raid() {
		System.out.println("biker");
	}

	private void camp(int pincode) {
		System.out.println(pincode);
// Ex 1
// idhula nama string or int edhu koduthalum,syso la um adha apdiye kodukanum
// apo dhan adha nama main la cal pandra apo name or values koduka mudium
	}

	private void count(int numbers) {
		System.out.println("numbers");
// Ex 2
// nama int or string koduthalum, syso la double semicolen ulla edhu
// irundhalum adhedhan print agum
	}

	private void count() {
		System.out.println("house");
//idhu nama normal aa method create pani main la cal pandrom, see before method - Ex 2 in top side
	}

	@Override
	public void student_info(int no, String address, int pincode) {
		super.student_info(no, address, pincode);
	}

	public static void main(String[] args) {

		All_in_one_sample og = new All_in_one_sample();

		og.raid();
		og.camp(608001);
		og.count(608005);
		og.count();
		og.student_info(20, "addressnagar", 602222);
		og.student_info("keyboard");
		og.student_info(11);

	}

}
