package string;

public class String_class3 {

	public static void main(String[] args) {

		String a = "Go kul7>*balaji*/%@12345,";
		
		
		
		String gg = a.replaceAll( "[^A-Za-z0-9]" , " " );

		System.out.println(gg);
		
/*first a. nu type pani cntrl space then replace all kodukanum
 apram "" koduthu adhu ulla array[] kodukanum apram arry[] ulla first
 power^ kodukanum apo dhan namaku console la wordings matum varum
 capital wording matum dhan venum na A-Z kodukanum small letters
 na a-z kodukanum then numeri numbers venumna 0-9 kodukanum idhulaye
 special character venumna nama add paniklam after9 this > 
 koduthalum output la varum. then second aa koduthurkura new string
 la " " with center space oda kodutha namaku console la space oda
 varum	*/	
		
        String g1 = a.replaceAll( "[A-Za-z0-9]" , " " );
		
		System.out.println(g1);
		
/*idhula arry[] ulla power^ kodukalana only special character matum
console la varum,array ulla nama edha kodukuromo adhellam console la
 varadhu nu dhan meaning    */
		
	
	}

}
