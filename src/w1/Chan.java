package w1;

import java.util.Arrays;

public class Chan {
   public static void main(String[] args) {
      
      String[] keyinput = {"left", "left", "left", "left","right","right","right","right"};
      int[] board = {5, 5};
      
      int[] answer = new int[2];
      
      
      int x = 0; 
      int y = 0;
      
      for(int a = 0; a < keyinput.length; a++) {
         if(keyinput[a].equals("right")) {
            x += 1;
         }else if(keyinput[a].equals("left")) {
            x -= 1;
         }else if(keyinput[a].equals("up")) {
            y += 1;
         }else if(keyinput[a].equals("down")) {
            y -= 1;
         }
      }

      int mx = (board[0]-1)/2;
      if(x > mx) {
         x = mx;
      }else if(x < -mx) {
         x = -mx;
      }
      
      int my = (board[1]-1)/2;
      if(y > my) {
         y = my;
      }else if(y < -my) {
         y = -my;
      }
      
      answer[0]= x;
      answer[1]= y;
      
      System.out.println(Arrays.toString(answer));
      
      
   }

}