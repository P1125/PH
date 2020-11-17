package condition;

public class ConditionExample {
	public static void main(String[] args) {
		int score = 96;
		String grade = " ";

		if (score >= 90) {
			if (score >= 95) {
				grade = "A+";
			} else { // if안에 중첩if를 써서 A+를 넣는경우 else로 처리해야함
				grade = "A";
			}
		} else if (score >= 80) {
			if (score >= 85) {
				grade = "B+";
			} else {
				grade = "B";
			}
		} else if (score >= 70) {
			if (score >= 75) {
				grade = "C+";
			} else {
				grade = "C";
			}
		} else if (score >= 60) {
			if (score >= 65) {
				grade = "D+";
			} else {
				grade = "D";
			}
		} else {
			grade = "F";
		}
		System.out.println(score + "점은" + grade + "입니다.");

		// 70점 이상 C , 60점 이상 D , 60점 미만 F

	}

}
