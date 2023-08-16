package types_of_variables;

public class Final_variable {
	
		int score = 54321;
		
		long members = 5555555l;
		
		final int count = 11; 
// final keyword added can not change the value is fixed

		private void cricket() {
			int time = 12345;
			time = 6789;
			System.out.println(time);
			
			System.out.println(score);
			System.out.println(count); // method level it will accept
		}

		public static void main(String[] args) {

			Final_variable ob = new Final_variable();

			ob.cricket();

			System.out.println(ob.members);
			System.out.println(ob.count); // class level also accept

		}

	}
	
		
		
		
		
		
