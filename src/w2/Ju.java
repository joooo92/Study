package w2;

public class Ju {
	public static void main(String[] args) {

		int[] nums = {1,2,3,4};
		int answer = 0;
		int i = 0;
		
		 //3개 수 뽑기
	    for(int a = 0; a < nums.length; a++) {
				for(int b = a+1; b < nums.length; b++) {
					for(int c = b+1; c < nums.length; c ++) {
					//3개수 더하기
					i = nums[a] + nums[b] + nums[c];

	        // 소수 찾기
					for(int j = 2; j <= i; j++) {
						if(i == j) {
							answer ++;
						}else if(i % j == 0){
							break;
							}
						}
					}
				}
			}
		
	    System.out.println(answer);
	}
}