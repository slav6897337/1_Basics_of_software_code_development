package by.slava.main;
import java.util.Scanner;
public class LesLine3 {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		float x;
		float y;
		System.out.println("Input x and y");
		x = in.nextFloat();
		y = in.nextFloat();
		in.close();
		double z;
		z = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x * y);
		System.out.println("result= " + z);
	}
}
