package upcasting;

public class Parent_sivakumar {
	
	public void good() {
System.out.println("night");
	}
	
	public void vibrator() {
System.out.println("millarea");
	}
	
	public void pump() {
System.out.println("ctmakeup");
	}
	
    void morning(String tiffen , int howmany) {
System.out.println(tiffen + '-'+ howmany);
	}

	public void car(String handwheel, int gear) {
System.out.println(handwheel +'-'+ gear);
	}
	
	
	public static void main(String[] args) {

		Parent_sivakumar obj = new Child_surya(); // correct
				
		obj.good();
		obj.vibrator();
		obj.pump();
		obj.morning("iiii", 10);
		obj.car("carstearing", 666);
	
	}

}
