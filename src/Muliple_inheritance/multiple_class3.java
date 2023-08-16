

//idhu method one
// see bottom side method two

package Muliple_inheritance;

public class multiple_class3 implements multiple_interface1, multiple_interface2 {

	private void toor() {
		System.out.println("ooty");
	}

	@Override
	public void powerplant() {
		System.out.println("turbine");
	}

	@Override
	public void fruits() {
		System.out.println("apple");

	}

	public static void main(String[] args) {

		multiple_class3 obj = new multiple_class3();

		obj.toor();
		obj.powerplant();
		obj.fruits();

	}

}


//in multiple_class3 then give implements keyword because of interface to class merge
//after write the implements keyword then give multiple interface 2 because 
// multiple interface 2 and multiple interface 1 both are already in merged condition. 







