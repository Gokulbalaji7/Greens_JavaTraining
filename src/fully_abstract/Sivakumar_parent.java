package fully_abstract;

public interface Sivakumar_parent {

	void bike(); 
	// package - right click - new - interface
	// we used interface in interface the method is alredy in public see colour.
    // move the mouse coursor to objectbike to see colour.

	void car(int year);

	void student(String name);

	void motor(int no, String vehicletype, int pincode);

	public static void main(String[] args) {

		Sivakumar_parent obj = new Surya_child();

		obj.bike();
		obj.car(2015);
		obj.student("gokul");
		obj.motor(7777, "petrol type", 68888);

	}

}
