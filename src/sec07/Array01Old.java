package sec07;

public class Array01Old {

	private static int sum;

	public static void main(String[] args) {
		/*
		 * int a = 80; int b = 75; int c = 90; sum = 0;
		 * 
		 * sum = (a + b + c); System.out.println("총합: " + sum);
		 * System.out.println("평균: " + (double) sum / 3); 내가한거
		 */

		int a = 80;
		int b = 75;
		int c = 90;
		sum = 0;

		sum = (a + b + c);
		double avg = sum / 3.0;
		// double avg= (double)sum / 3;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

		System.out.println("총점 : " + sum);
		
		System.out.println("1. 평균 : " + avg);
		System.out.println("2. 평균 : %.2f \n");
		System.out.println("3. 평균 : " + Math.round(avg * 100/100.0));
		System.out.println();
		System.out.println(String.format("4. 평균 : %.2f", avg));

	}

}