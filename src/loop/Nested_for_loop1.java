package loop;

public class Nested_for_loop1 {

		public static void main(String[] args) {
			
//1
			for (int i = 1; i <=5; i++) {
				
				for (int j = 1; j <=i; j++) {
					
					System.out.print("*");
					
				}
				System.out.println();
				
			}
			
			
			System.out.println();
			
			
//2		
		for (int i = 1; i <=5; i++) {
				
				for (int j = i; j <=5; j++) {
					
					System.out.print("*");
					
				}
				System.out.println();
				
			}
		
		System.out.println();
		
//3
		for (int i = 1; i <=5; i++) {
			
			for (int j = 1; j <=i; j++) {
				
				System.out.print(j);
				
			}
			System.out.println();
			
		}
		
		System.out.println();
		
		

//4
			int k =1;	
				for (int row = 1; row <=5; row++) {
					for (int j = 1; j <=row ; j++) {
						System.out.print(k+" ");
						k++;
					}
					System.out.println();
				}
		
		
				System.out.println();
	
				
//5
				
				for (int i = 1; i <=5; i++) {
					
					for (int j = 1; j <=4; j++) {
						    System.out.print(i);
							//System.out.print(j);
						}
							System.out.println();
						
					}	
				
				
				System.out.println();
				
				
		
//6
		for (int i = 1; i <=5; i++) {
			
			for (int j = i; j <=5; j++) {
				
				System.out.print(j);

			}
			System.out.println();
			
		}
	
		}	
	}

// 6 th if i will syso output is 
//11111
//2222			
//333
//22
//1

//6 th if j will syso output is
//12345
//2345
//345
//45
//5
