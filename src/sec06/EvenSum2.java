package sec06;

public class EvenSum2 {

	public static void main(String[] args) {
		int sum2 = 0;
		int sum3 = 0;

		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				sum2 += i;
			}
			if (i % 3 == 0) {
				sum3 += i;
			}
			System.out.println("1~10 2의 배수합 : " + sum2);
			System.out.println("1~10 3의 배수합 : " + sum3);
		}

	}
}
