package polymorphism2;

public class Parentclass {

		
		public void student_info(String name) {
	System.out.println(name);
		}
		
		protected void student_info(int age) {
	System.out.println(age);
	//doubt in int or short
		}

		private void student_info(char gender) {
	System.out.println(gender);
		//no doubt in char or string 
			}
		
		public void student_info(int no ,String address, int pincode) {
	System.out.println(no +" "+ address+"-"+pincode);
	// doubt in int no or short no
		}
		
		 void student_info(byte fees) {
	System.out.println(fees);
		}
		
		public void student_info(String initial, String fathersname) {
	System.out.println(initial +" "+ fathersname);
		}
		
		private void student_info(String bank, long accountnumber) {
	System.out.println(bank+':'+ accountnumber);
		}
		
		public static void main(String[] args) {

			Parentclass obj = new Parentclass();
					
			obj.student_info("Gokul");
			obj.student_info(30);
			obj.student_info("Male");
			obj.student_info(14, "mk nagar", 608001);
			obj.student_info(111);
			obj.student_info("T Ravi");
			obj.student_info("hdfc", 1234567890987654321l);
			
		}	
	}





