package sec06;

public class For1To100Sum {
	public static void main(String[] args) {
		int sum = 0;
		int i;

		for (i = 1; i <= 100; i++) {
			sum += i;
			sum = sum + i;

		}

		System.out.println("1~" + (i) + "합 : " + sum);
	}
}
