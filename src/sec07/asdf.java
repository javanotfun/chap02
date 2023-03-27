package sec07;

public class asdf {

	public static void main(String[] args) {
		int[][] mathScores = new int[2][3]; // 2=반 3=학생

		mathScores[0][0] = 80;// 0 반 , 0학생
		mathScores[0][1] = 83;
		mathScores[0][2] = 85;
		mathScores[1][0] = 86;
		mathScores[1][1] = 90;
		mathScores[1][2] = 92;

		int count = 0;
		// 전체 학생의 수학 평균 구하기
		for (int i = 0; i < mathScores.length; i++) {
			for (int j = 0; j < mathScores[i].length; j++) {
				System.out.print(mathScores[i][j] + " ");

				if (mathScores[i][j] >= 90) {
					count = count + 1;
				}
			}
			System.out.println();
		}
		System.out.println("90점 이상인 학생수 :: " + count);
	}
}
