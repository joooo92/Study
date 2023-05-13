package w2;

public class Hm {
	public static void main(String[] args) {
		
		String new_id = "...!@BaT#*..y.abcdefghijklm";
		
		//1단계
		new_id = new_id.toLowerCase();
		
		//2단계
		new_id = new_id.replaceAll("[^-_.abcdefghijklmnopqrstuvwxyz0123456789]", "");
		
		//3단계
		
		System.out.println(new_id);
		
	}
	

}
