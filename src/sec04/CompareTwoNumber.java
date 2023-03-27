package sec04;

import java.util.Scanner;

public class CompareTwoNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("첫번째 숫자를 입력하시오");
		int a = scanner.nextInt();

		System.out.println("두번째 숫자를 입력하시오");
		int b = scanner.nextInt();

		if (a > b) {
			System.out.println("첫 번째 숫자가 큽니다.");
		} else {
			System.out.println("두번째 숫자가 큽니다.");

		}
	}
}
