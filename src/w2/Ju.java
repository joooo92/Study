package w2;

public class Ju {
	public static void main(String[] args) {

		int[] nums = {1,2,3,4};
		int answer = 0;
		int i = 0;

		for(int a = 0; a < nums.length; a += 2) {
			for(int b = 0; b < nums.length; b += 2) {
				for(int c = 0; c < nums.length; c += 2) {
					if(a < c) {
						i = nums[a] + nums[b] + nums[c];
						System.out.println(i);
						//                  for(int d = 2; d < i; d++) {
							//                     if(i / d != 0) {
						//                        answer += 1;
						//                     }

					}

				}
				//            else {
				//                  break;
			}

		}
	}
}
//      
//      for(int d = 1; d < i; d++) {
//         if(i % d != 0) {
//            answer += 1;
//            
//         }
//      }


//System.out.println(answer);

//}
//
//}