package by.slava.main;

public class LesCycle3 {
	public static void main(String[] args) {
        int sum = 0;
        for(int i = 1; i <= 100; i++){
         sum += Math.pow(i,2);   
        }
        System.out.println(sum);
    }
}
