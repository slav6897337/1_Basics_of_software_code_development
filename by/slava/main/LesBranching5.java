package by.slava.main;
import java.util.Scanner;
public class LesBranching5 {
    public static void main(String[] args) {
        int x;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter x");
        x = in.nextInt();
        in.close();
        float f;
        if(x <= 3)
        f = x * x - 3 * x + 9;
        else
        f = 1 / (float)(x * x * x + 6);
        System.out.println(f);
  }
}
