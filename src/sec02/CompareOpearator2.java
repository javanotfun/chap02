package sec02;

import java.util.Scanner;

public class CompareOpearator2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		char ch = ' ';
		System.out.printf("영문자와 숫자 또는 한글을 입력하세요.");
		String input = scanner.nextLine();
		ch = input.charAt(0);

		if ('0' <= ch && ch <= '9') {
			System.out.printf("ke- %c 매핑 유니코드는 %d 입니다.", ch, (int) ch);

			if ('a' <= ch && ch <= 'z') {
				System.out.printf("ke- %c 매핑 유니코드는 %d 입니다.", ch, (int) ch);

			}
		}
	}
}