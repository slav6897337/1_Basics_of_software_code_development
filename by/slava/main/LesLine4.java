package by.slava.main;
import java.util.Scanner;
public class LesLine4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		float a;
		System.out.println("Enter number format nnn.ddd");
		a = in.nextFloat();
		in.close();
		int b = (int)a;
		int c = (int)((a - b) * 1000);
		float d = c + (float)b / 1000;
		System.out.println("Input valeu = " + a + " Result valeu = " + d);
	}
}
