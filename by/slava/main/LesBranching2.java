package by.slava.main;
import java.util.Scanner;
public class LesBranching2 {
	public static void main(String[] args) {
    int a;
    int b;
    int c;
    int d;
    Scanner in = new Scanner(System.in);
    System.out.println("Enter a, b, c, d.");
    a = in.nextInt();
    b = in.nextInt();
    c = in.nextInt();
    d = in.nextInt();
    in.close();
    int min;
    if(a <= b){
    	min = a;
    	} else {
        	min = b;
        	}
        if(c <= d){
            System.out.println((min >= c) ? min : c);
        } else {
        	System.out.println((min >= d) ? min : d);
        	}
        }
}
