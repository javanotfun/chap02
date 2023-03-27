package sec07;

public class Array13MaxValue {

	private static Object arr;

	public static void main(String[] args) {

		int a = 10;
		int b = 20;
		int c = 30;
		int d = 40;
		int e = 50;

		int max = 0;
		if (a > max)
			max = a;
		if (b > max)
			max = b;
		if (c > max)
			max = c;
		if (d > max)
			max = d;
		if (e > max)
			max = e;
		System.out.println("제일 큰수는 : " + max);
		max = 0;
		int[] arr = new int[5];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;

		for (int ar : arr) {
			if (ar > max) {
				max = ar;
			}
		}
		System.out.println("향상된 for문 제일 큰수는 : " + max);
		
		max = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("max" + max);
	}
}
