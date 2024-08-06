package sosnujava;

import java.util.Scanner;

public class baitapswcase {
	public static void main(String[] args) {
		System.out.println(">> LỰA CHỌN TÍNH NĂNG <<");
		System.out.println("++ ------------------ ++");
		System.out.println("| 1. Cộng |");
		System.out.println("| 2. Trừ |");
		System.out.println("| 3. Kết thúc |");
		System.out.println("++ ------------------ ++");
		System.out.println("Lựa chọn của bạn là : ");
		Scanner scanner = new Scanner(System.in);
		int value = scanner.nextInt();
		switch (value) {
		case 1:
			System.out.println("ban da lua chon addition");
			break;
		case 2:
			System.out.println("ban da lua chon subtraction");
			break;
		default:
			System.out.println("ban da lua chon exit program");
			System.exit(0);
		}

	}

}
