package sosnujava;

import java.util.Scanner;

public class bai2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhap vao canh a");
		int a = scanner.nextInt();
		System.out.println("nhap vao canh b");
		int b = scanner.nextInt();
		System.out.println("chu vi " + (a + b) * 2);
		System.out.println("dien tich" + a * b);
		System.out.println("canh nho nhat : " + Math.min(a, b));
		System.out.println("canh lon nhat : " + Math.max(a, b));
		scanner.close();
	}

}
