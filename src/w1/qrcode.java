package w1;

import java.util.Arrays;
import java.util.Scanner;

public class qrcode {
	public static String main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int q = scan.nextInt();
		int r = scan.nextInt();
		String code = scan.next();
		
		char[] code2 = code.toCharArray();

		String answer = "";
		
		for(int i = 0; i < code.length(); i++) {
			if(i % q == r) {
				answer += code2[i];
			}
			
		} return answer;
		
		
		
		
		
	}
	

}
