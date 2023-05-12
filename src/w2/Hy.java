package w2;

public class Hy {
	public static void main(String[] args) {
		
		String[] id_pw = new String[] {"meosseugi", "1234"};
		
		String[][] db = new String[][] {{"rardss", "123"}, 
										{"yyoom", "1234"}, 
										{"meosseugi", "1234"},
										{"osseu", "1234"},
										{"meosseugi", "122345"}};
		
		//아이디, 패스위드는 id_pw와 db 둘다 2개씩 고정이라 0,1 값을 지정해주고 db값이 변경될때를 각각 비교.
										
		for(int a = 0; a < db.length; a++) { // db길이만큼 회전시켜서 각각 구분
			
			if(id_pw[0].equals(db[a][0])) { //아이디가 같을경우에 대한 비교
				//패스워드에대한 각각의 비교 비교
				if(id_pw[1].equals(db[a][1])) { // 아이디가 같은데, 패스워드도 같을때 
					System.out.println("login");
				}else {
					System.out.println("wrong pw"); // 아이디는 같은데 패스워드가 틀릴때
				}
			}else{ //그외 모든 경우
				
				System.out.println("fail");
			}
		
			
		}
		
		
		
		
		
	}

}
