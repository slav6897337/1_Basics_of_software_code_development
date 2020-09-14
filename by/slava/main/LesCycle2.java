package by.slava.main;
import java.util.Scanner;
public class LesCycle2 {
	 public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        System.out.println("Enter a,b and step h");
	        int a = scan.nextInt();
	        int b = scan.nextInt();
	        int h = scan.nextInt();
	        scan.close();
	        for(int x = a; x <= b; x += h){
	            if(x > 2)
	            System.out.println(x); else
	            System.out.println(-x);
	        }
	    }
}
