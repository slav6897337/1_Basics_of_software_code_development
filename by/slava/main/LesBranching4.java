package by.slava.main;
import java.util.Scanner;
public class LesBranching4 {
    public static void main(String[] args) {
    int a;
    int b;
    int x;
    int y;
    int z;
    Scanner in = new Scanner(System.in);
    System.out.println("Enter a, b, x, y, z.");
    a = in.nextInt();
    b = in.nextInt();
    x = in.nextInt();
    y = in.nextInt();
    z = in.nextInt();
    in.close();
    int min, sr;
    if (x <= y){
    	min = x;
    	sr = y;
    	} else {
    		min = y;
    		sr = x;
    		}
    if (z < min)
    min = z;
    else {
        if (z < sr)
        sr = z;
        }
    
    if (a > b){
        if (sr < a && min < b)
        System.out.println("Кирпичь проходит в отверстие");
        else
        System.out.println("Кирпичь не проходит в отверстие");
        } else {
        	if (sr < b && min < a)
        		System.out.println("Кирпичь проходит в отверстие");
        	else
        		System.out.println("Кирпичь не проходит в отверстие");
        	}
  }
}
