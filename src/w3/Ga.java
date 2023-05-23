package w3;

import java.util.Arrays;
import java.util.Collections;


public class Ga {
	public static void main(String[] args) {
		
		long n = 118372;
		String s = String.valueOf(n) ;
		String[] s2 = s.split("");
		long n2 = 0;
		
		Arrays.sort(s2, Collections.reverseOrder());
		
		String str = "";
		
		for(String str2 : s2) {
			str += str2;
		}
		
		 n2 = Long.parseLong(str);
		
		
		
		System.out.println(n2);
				
		
		
		
		
		
	}

}
