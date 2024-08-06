package sosnujava;

public class bai3 {
	public static void main(String[] args) {
		int tax = 5;
		if (tax < 10) {
			System.out.println("khong dong thue");
		} else {
			if (10 < tax && tax <= 15) {
				System.out.println("thue 10%");
			} else if (15 < tax && tax <= 30) {
				System.out.println("thue 20%");
			} else {
				System.out.println("thue 50%");
			}
		}
	}
}