package by.slava.main;
import java.util.Scanner;

public class LesLine2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		float a;
		float b;
		float c;
		System.out.println("Input a, b, c");
		a = in.nextFloat();
		b = in.nextFloat();
		c = in.nextFloat();
		in.close();
		double z;
		z = (b + Math.sqrt(b * b + 4 * a * c)) / 2 * a - a * a *a * c + Math.pow(b, -2);
		System.out.println("Result=\t " + z);
		
			
	}
}
