package condition;

public class ConditionExample2 {
	public static void main(String[] args) {
		int score = 99;
		score /= 10;
		String grade = " ";
		
		
		switch (score) {
		case 9 :
			grade = "A";
			break;
		case 8 :
			grade = "양호";
			break;
		case 7 :
		case 6 :
			grade = "보통";
			break;
		default:
			grade = "미흡";
		}	
		System.out.println((score*10)+"점은"+grade +"입니다");
	}
}	
		
		