package w2;

public class Hm {
	public static void main(String[] args) {
		
		String new_id = "...!@BaT#*..y.abcdefghijklm";
		
		 //1단계
		new_id = new_id.toLowerCase();

		//2단계
		new_id = new_id.replaceAll("[^-_.a-z0-9]", "");

		//3단계
		new_id = new_id.replaceAll("[\\.]+", ".");

		//4단계
		new_id = new_id.replaceAll("^\\.|\\.$", "");

		//5단계
		if(new_id.equals("")) {
		    new_id = new_id.replace("", "aaa");
		}

		//6단계
		int a = new_id.length();
		if(a >= 16 ) {
			new_id = new_id.substring(0, 15);
			if(new_id.charAt(new_id.length() - 1) == '.') {
				new_id = new_id.substring(0, new_id.length() - 1);
			}
		}

		//7단계
		while(new_id.length() < 3) {
			new_id += new_id.charAt(new_id.length()-1);

		}
		String answer =  new_id;
		
		System.out.println(answer);
		
	}
	

}
