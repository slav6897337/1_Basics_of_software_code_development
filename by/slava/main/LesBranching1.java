package by.slava.main;
import java.util.Scanner;
public class LesBranching1 {
	 public static void main(String[] args) {
         int x;
         int y;
         Scanner in = new Scanner(System.in);
         System.out.println("Enter x and y");
         x = in.nextInt();
         y = in.nextInt();
         in.close();
         if(x + y < 180 ){
             System.out.println((x == 90 || y == 90 || (x + y) == 90) ? "Треугольник существует и он прямоугольный" : "Такой треугольник существует");
           } else 
          System.out.println("Такого треугольника нет");
   }

}
