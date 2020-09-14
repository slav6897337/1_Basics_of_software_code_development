package by.slava.main;
import java.util.Scanner;
public class LesCycle7 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the gap m and n");
        int m = sc.nextInt();
        int n = sc.nextInt();
        sc.close();
        int counter = 0;
        for ( int i = m; i <= n; i++){
            for(int j = 2; j < n; j++){
            	if (i == j)
            		continue;
                if (i % j == 0) {
                	System.out.println("Number "+ i + "\tshares " + j);
                	counter++;
                }
                
               
                	 
            }
        } 
        if(counter == 0)
        System.out.println("There are no divisors in the number series ");
    }
}
