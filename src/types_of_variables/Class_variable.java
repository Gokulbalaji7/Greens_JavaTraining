package types_of_variables;

public class Class_variable {

	String captain = "dhoni";
	// idhu class lvl la iruku idha method laum syso paniklam but
	// vera datattype aa irukanum ilana same datatype but vera reference name aa
	// irukanum.
	// main laum syso paniklam but syso la object.reference name aa kodukanum.

	int time = 54321;
	// this int and long idhum cass lvl la iruku idhukum syso main laye panikalam no
	// prob.
	// or method laum syso paniklam but vera datatype aa irukanum ilana same datatype
	// but vera reference name aa irukanum.

	long members = 5555555l; // see above int instruction
	// members = 44444444l;
	// class la second reference name and value nama changes
	// panamudiyadhu apdiye panalum inside method and main la change agadhu ,
	// local mathiri illai so class level not accepted.

	private void cricket() {
		int time = 12345;
		time = 6789; // with local method
		System.out.println(time);

		System.out.println(captain);

	}

	public static void main(String[] args) {

		Class_variable ob = new Class_variable();

		ob.cricket();

		System.out.println(ob.time);
		// ippo nama class lvl la create panuirkura syntax ku main la syso edukalam
		// syso koduthutu () idhukulla nama cal pandra syntax oda object
		// (object . reference name)class lvl la koduthurkum ref name
		System.out.println(ob.members);
	}

}
