package by.slava.main;
import java.util.Scanner;
public class LesLine5 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter secundes");
		int a = in.nextInt();
		in.close();
		int hour = a / 3600;
		int min = a % 3600 / 60;
		int sec = a % 3600 % 60;
		System.out.println(hour + "ч " + min + "мин " + sec + "сек");
	}
}
