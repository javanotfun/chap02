package sec04;

public class IfNestedExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = (int) (Math.random() * 20) + 81;
		System.out.println("점수: + score");

		String grade = null;

		if (score >= 90) {
			if (score >= 95) {
				grade = "A+";
			} else {
				grade = "A";
			}
			if (score >= 85) {
				grade = "B+";
			} else {
				grade = "B";
			}

		}
		System.out.println("학점: " + grade);
	}
}
