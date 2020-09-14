package by.slava.main;
import java.util.Scanner;
public class LesBranching3 {
    public static void main(String[] args) {
        int x1;
        int x2;
        int x3;
        int y1;
        int y2;
        int y3;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter x1,y1; x2,y2; x3,y3.");
        x1 = in.nextInt();
        y1 = in.nextInt();
        x2 = in.nextInt();
        y2 = in.nextInt();
        x3 = in.nextInt();
        y3 = in.nextInt();
        in.close();
        int a, b, c;
        a = y1 - y2;
        b = x2 - x1;
        c = x1 * y2 - x2 * y1;
        if ((a * x3 + b * y3 + c) == 0)
        System.out.println("Точки принадлежат одной прямой"); else
        System.out.println("Точки не принадлежат одной прямой");
  }

}
