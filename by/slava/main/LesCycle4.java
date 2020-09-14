package by.slava.main;
public class LesCycle4 {
	public static void main(String[] args) {
        int pr = 1;
        for(int i = 1; i <= 200; i++){
         pr *= Math.pow(i,2);   
        }
        System.out.println(pr);
    }
}
