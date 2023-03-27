package sec06;

import java.util.Scanner;

public class LoginCheck {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("아이디를 입력 해주세요");
		String id = scan.nextLine();

		if (id.equals("java")) {
			System.out.println("비밀번호를 입력 해주세요");
			String pw = scan.nextLine();

			if (pw.equals("1234")) {
				System.out.printf("%s님 환영합니다.\n", id);
			} else {
				System.out.println("비밀번호가 아닙니다.");
			}

		} else {
			System.out.println("계정이 아닙니다.");
			scan.close();
		}

	}
}
