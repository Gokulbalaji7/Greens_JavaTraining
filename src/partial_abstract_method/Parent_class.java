
package partial_abstract_method;

public abstract class Parent_class {

	public void university() {
		System.out.println("annamalai");
	}

	public abstract void degree();
	//{} indha bracket aa delete panidnum then ; idha add panidnum
	// private nu irukrardha public nu change pananum apo dhan child la cal pana mudiunm.

	public abstract void project();

	public static void main(String[] args) {

		Parent_class obj = new Child_class();
// syntax parent clas la new va child class la irukra methods aa cal pandradhu
// idhula child la irukra methods aa cal pana mudiyadhu only parent mthds and parent override methods.
// idhu nama child la syso la type pana name adha dhan obj la cal pandrapo eduthukum.
		
		obj.university();
		obj.degree();
		obj.project();

		
	}

}
