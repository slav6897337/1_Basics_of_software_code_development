package by.slava.main;
import java.util.Scanner;
public class LesCycle1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter positiv number, n");
        int n = scan.nextInt();
        scan.close();
        int sum = 0;
        for(int i = 1; i <= n; i++){
        	sum += i;        
        }
        System.out.println(sum);
    }
}
