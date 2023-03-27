package sec08;

import com.sun.org.apache.xpath.internal.operations.Equals;

public class Emoployee {

	public static void main(String[] args) {
		String[] name = { "PJH", "JDW", "AJH", "HST", "HTW", "LWS", "LSD", "YJH", "JSW", "LKO" };
		int[] age = { 27, 34, 28, 26, 41, 28, 42, 29, 29, 32 };
		String[] phone = { "010-8532-0537", "010-9672-5257", "010-9932-4536", "010-4117-0975", "011-8975-7892",
				"010-6251-6976", "010-9482-6059", "010-4845-0105", "010-6283-4849", "010-4510-1609" };
		char[] gender = { 'F', 'M', 'F', 'M', 'M', 'F', 'M', 'M', 'F', 'M' };
		int[] pay = { 460, 200, 250, 300, 300, 200, 350, 200, 400, 440 };
		String[] country = { "일본", "프랑스", "일본", "미국", "캐나다", "덴마크", "한국", "영국", "미국", "한국" };

		System.out.println("		<< 사원정보 >>			");
		System.out.println("========================================================");
		System.out.println("name	age	    phone 	gender	pay	country");
		System.out.println("--------------------------------------------------------");
		for (int i = 0; i < name.length; i++) {
			System.out.println(
					name[i] + "\t" + age[i] + "\t" + phone[i] + "\t" + gender[i] + "\t" + pay[i] + "\t" + country[i]);

		}
		System.out.println("========================================================");
		int sumAge = 0;
		int count = 0;
		double avgAge = 0.0;
		char c = 'M';

		for (int i = 0; i < gender.length; i++) {
			if (gender[i] == c) {
				sumAge += age[i];
				count++;

			}

		}
		avgAge = (double) sumAge / count;
		System.out.printf("2. 남자 사원의 숫자는 : %d 명이며 평균연령은 %.1f 세입니다.", count, avgAge);
		System.out.println();

		// 3. 여성 사원들의 평균 급여 구하기
		int sumMoney = 0;
		count = 0;
		double avgMoney = 0.0;
		char f = 'F';

		for (int i = 0; i < gender.length; i++) {
			if (gender[i] == f) {
				sumMoney += pay[i];
				count++;
			}

		}
		avgMoney = (double) sumMoney / count;
		System.out.println("여자 사원 평균 월급 " + avgMoney + "원 입니다.");
		System.out.println();

		// 4.일본에 근무하는 사원들의 이름과 연락처 구하기

		String nameString = "";
		String phoneString = "";
		String[] arrName = null;
		String[] arrPhone = null;

		for (int i = 0; i < country.length; i++) {
			if (country[i].equals("일본")) {
				nameString = nameString + name[i] + ","; // 일본인 이름 nameString 에 저장
				phoneString = phoneString + phone[i] + ",";

			}

		}

		arrName = nameString.split(","); // 이름 ,단위로 분리해서 이름 배열에 할당
		arrPhone = phoneString.split(","); // 연락처 ,단위로 분리해서 연락처 배열에 할당

		System.out.println("4. 일본 사원들의 이름과 연락처");
		for (int i = 0; i < arrName.length; i++) {
			System.out.println(arrName[i] + " " + arrPhone[i]);
		}
		System.out.println();
	}

}
