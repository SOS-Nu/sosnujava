package sosnujava;

import java.util.Scanner;

public class bai1 {
	public static void main(String[] args) {
		{
			Scanner scanner = new Scanner(System.in);
			System.out.println("nhap vao ten sinh vien");
			String a = scanner.nextLine();
			System.out.println("nhap vao diem trung binh");
			int b = scanner.nextInt();
			System.out.println("ten sinh vien: " + a + ", diem trung binh: " + b);
			scanner.close();
		}
	}
}