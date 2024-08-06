package sosnujava;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap maxScore: ");
		float maxScore = scanner.nextFloat();

		System.out.print("Nhap userScore: ");
		float userScore = scanner.nextFloat();
		System.out.println(userScore);
		// Calculate the percentage of the user's score in relation to the maximum
		// available score.
		// Convert maxScore to float to make sure that the division is accurate
		float percentage = (float) userScore / (float) maxScore * 100.0f;

		System.out.println("User's percentage is " + percentage);

		scanner.close();

	}
}
