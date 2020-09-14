package by.slava.main;
import java.util.Scanner;

public class LesCycle5 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter e");
        double e = sc.nextDouble();
        sc.close();
        double sum = 0;
        int i =0;
        while(Math.abs(1 / Math.pow(2,i) + 1 / Math.pow(3,i)) >= e){
            sum = sum + (1 / Math.pow(2,i) + 1 / Math.pow(3,i));
            i++;
        }
        System.out.println(sum);
    }
}
