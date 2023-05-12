package w2;

import java.util.Arrays;

public class Jw {
	public static void main(String[] args) {
		
		String s = "10 Z 20 Z 1";
		int answer = 0;
		
		String[] arr = s.split(" ");
		
		for(int a = 0; a < arr.length; a++) {
			
			if(!arr[a].equals("Z")) {
				int i = Integer.parseInt(arr[a]); 
				answer += i;
				
				}else {
					 
				 answer -= Integer.parseInt(arr[a-1]); 
					
			}
		}
		
	System.out.println(answer);	
		
		
		
	}

}
