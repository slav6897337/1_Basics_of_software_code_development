package by.slava.main;
import java.util.Scanner;
//z = ( (a – 3 ) * b / 2) + c.
public class LesLine1 {
	public static void main(String[] args) {
		int a;
		int b;
		int c;
		float z;
		Scanner in;
		in = new Scanner(System.in);
		System.out.println("Imput a: ");
		a = in.nextInt();
		System.out.println("Imput b: ");
		b = in.nextInt();
		System.out.println("Input c: ");
		c = in.nextInt();
		in.close();
		z = (float)(a - 3) * b / 2 + c;
		System.out.println(z);
	}
}