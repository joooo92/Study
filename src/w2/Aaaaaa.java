package w2;

public class Aaaaaa {
	public static void main(String[] args) {
		
		String str = "abcdefghijk";
		
//		String str2 = str.replaceAll("abd", "천");
		
		
		System.out.println(str.replaceAll("[^abd]", "천"));
		
	}

}
