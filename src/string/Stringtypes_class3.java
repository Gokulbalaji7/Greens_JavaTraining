package string;

public class Stringtypes_class3 {

	public static void main(String[] args) {

		
	                       //string
		
// in string both variable value is same condition
// ref string class 3 also how to find string value storage, type syso
//then inside() bracket of syso type System.identifyhashcode thenchange
//the referance name to a or b.
		
		
		
		
		String a = "Gokul";
		String b = "Gokul";

		System.out.println(System.identityHashCode(a));
		System.out.println(System.identityHashCode(b));
		
//ipo a&b two string ku same value or duplicate value same aa vandha
//java ore same single memory laye dhan values aa allogate pannum	

		
		
		
	                        // string buffer	
		
		StringBuffer c = new StringBuffer("bike");
		StringBuffer d = new StringBuffer("bike");
		
		System.out.println(System.identityHashCode(c));
		System.out.println(System.identityHashCode(d));
		
// in string buffer first type object syntax like example
// StringBuffer c = new StringBuffer(); then type any values in inside
// the () .then type syso and then identityhash then type object inside
// the () of identityhash.it allogate the new memory space.
// in stringbuffer it has two values same aa irundhalum it alogate
// seperate memory space because we using new keyword indha new keyword
//use panna seperate aa dhan memory alogate panum basic.
		
		
		                    // concat
		
		
		String gg = a.concat(b);
		
		System.out.println(System.identityHashCode(gg));
		
// in concat we want to save two oobject in single is known as concat
//type a.concat cntl space then give ok then type b 
//then take returntype then type syso then inside of syso identity hash code
//then inside of hashcode() we give object name. it also have seperate
//memory alogation. 
		
		
		
	// see in next class Stringtypes_class3_1
		
		
		
	
		
	
	}

}
