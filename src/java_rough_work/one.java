package java_rough_work;

public class one {

	private void friend_details(String nickname) {
System.out.println(nickname);
	}

	private void friend_details(String initial , String fathername) {
System.out.println(initial +" "+  fathername  );
	}
	
	private void friend_details(int no , String addressdistrict, int pincode) {
System.out.println(no +":"+ addressdistrict +"-"+ pincode );
	}
	
	private void friend_details() {
System.out.println();
	}
	
	
	public static void main(String[] args) {
		
		one obb = new one();
				
		obb.friend_details("ajith");
		obb.friend_details(91, "dkm cud", 608002);
		

	}

}