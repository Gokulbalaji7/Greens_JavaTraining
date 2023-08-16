package control_statement;

public class If_elese_if_statement {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;
		int c = 30;
		
//syntax ifelse condition koduthutu apram else pakathula thirumba ifelse apram 
//join panikalam .
	
		// Ex 1
		
		if (a==b) {
			System.out.println("condition 1 is true");
		} else if (a<b) {
			System.out.println("condition 2 is true");
		}else if (c<b) {
			System.out.println("condition 3 is true");
		}else{
            System.out.println("conditions false");
		}
		
		//Ex 2
		
		if (a==b) {
			System.out.println("condition 1 is true");
		} else if (b<a) {
			System.out.println("condition 2 is true");
		}else if (c<b) {
			System.out.println("condition 3 is true");
		}else{
            System.out.println("conditions false");
		}
		
		
// idhula if statement la condition fail aa irundha next irukura elseif ku poidum then
//adhulaum condition fail aa irundha thirumba elseif ku poidum then adhulaum 
//condition fail aa irundha last aa else la irukura value va output aa eduthukum.	
		
		
		
		
		
		
		
		
		
		
		
	}

}
