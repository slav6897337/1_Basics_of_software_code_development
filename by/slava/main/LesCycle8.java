package by.slava.main;
import java.util.Scanner;
public class LesCycle8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the gap m and n");
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        int capa = 0;
        int capb = 0;
        int da = 1;
        int db = 1;
        int aclon = a;
        int bclon = b;
        int counter = 0;
        while(aclon / 10 >= 1){
            capa++;
            aclon /= 10;
            da *= 10;
        }
         while(bclon / 10 >= 1){
            capb++;
            bclon /= 10;
            db *= 10;
        }   
        
        for(int i = 0; i <= capa; i++){
            int tempa = a / da;
            a = a % da;
            da /= 10;
            int dbtemp = db;
            bclon = b;
            for(int j = 0; j <= capb; j++){
                int tempb = bclon / dbtemp;
                bclon = bclon % dbtemp;
                dbtemp /= 10;  
                if (tempa == tempb) {
	                System.out.println("The number matched " + tempa); 
	                counter++;
                }
            }
        }
        if(counter == 0)
        	System.out.println("No matches "); 	
    }

}
