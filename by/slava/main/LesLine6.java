package by.slava.main;
import java.util.Scanner;
public class LesLine6 {
	public static void main(String[] args) {
      int x;
      int y;
      Scanner in = new Scanner(System.in);
      System.out.println("Enter x and y");
      x = in.nextInt();
      y = in.nextInt();
      in.close();
      if(0 <= y && y <= 4  && -2 <= x && x <= 2){
    	  System.out.println("true");
    	  } else{
    		  if(-3 <= y && y <= 0  && -4 <= x && x <= 4){
    			  System.out.println("true");
    			  }else{
    				  System.out.println("folse");
    				  }
    		  }
      }

}
