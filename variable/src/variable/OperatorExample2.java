package variable;

public class OperatorExample2 {
	
	public static void main(String[] args){
		//num1가 홀수이면 result 1만들기 짝수 0 , 홀수1
		// 1) if 구문
		// 2) ? : 구문
		
		int num1 = 2;
		if(num1 % 3 == 0) {
			System.out.println(0);
		} else {
			System.out.println(1);
		}
		
		boolean result =true;
		String result1 = (num1 %5 ) == 0 ? "True" : "False" ;
		System.out.println(result1);
			
	}
}
