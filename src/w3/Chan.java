package w3;

public class Chan {
	public static void main(String[] args) {
		//10마리당 1개 쿠폰 받음. 쿠폰으로 받은 치킨도 쿠폰 한개 준데
		
		int chicken = 1081;
		int result = 0;
		int newco = 0;
		
		
		
		while(true) {
			
		result += chicken / 10;
		newco = (chicken / 10) + (chicken % 10);
		chicken = newco;	
			
		if(newco < 10) {
			break;
		}
			
			
		}
		
		System.out.println(result);
		
		
		
		
		
		
		
		
		
		
		
	}

}
