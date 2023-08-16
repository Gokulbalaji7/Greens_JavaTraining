package upcasting;

public class Child_surya extends Parent_sivakumar {

	private void bike() {
		System.out.println("petrol");
	}

	@Override
	public void good() {
		super.good(); //want to remove the super keyword line so only we do upcasting
		System.out.println("satelite"); // new child syso print
	}
	
	@Override
	public void vibrator() {
		super.vibrator(); // with super keyword na parent file dhanvarum
	}
	
	@Override
	public void pump() {
		System.out.println("cwpm"); // correct method for upcasting
	}
	
	@Override
	public void car(String handwheel, int gear) {
		super.car(handwheel, gear);
		System.out.println(); // watch this override method
	}
	
	@Override
	void morning(String tiffen, int howmany) {
		super.morning(tiffen, howmany);
	}

	
	
	public static void main(String[] args) {
		
		Child_surya actor =new Child_surya(); // just checking

		actor.bike();
		
		actor.good();
		actor.vibrator();
		actor.pump();
		actor.car("stearing", 8888);
		actor.morning("ddddd", 33333);
		
	}

}
