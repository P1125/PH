package variable;

public class OperatorExample1 {

	public static void main(String[] args) {
		String str =  "Hello";
		str += "World";     //요약하는걸 추천    += 
		System.out.println(str);
		
		int num1 = 10;
		num1 += 5;
		num1 -= 3; // 12값까지나옴
		num1 *= 5; // 60
		num1 /= 6; // 10
		System.out.println("num1:"+num1);
		
		
		int num2 = 10;
		num2++;   //num2 = num2 + 1;  ++는 1 증가
		num2--;   // -- 1마이너스
		num2--;
		num2--;
		num2--;
		System.out.println("num2:"+num2);
		
		int num3 = 10;
		num3 -= 5;
		num3 -= 5;
		num3 -= 5;
		num3 += 15;
		
		
		if ( num3 > 0) {
			System.out.println("num3은 0보다 큽니다.");
		} else if (num3 < 0) {
			System.out.println("num3은 0보다 작습니다.");
		} else {
			System.out.println("num3은 0입니다.");
		}
		
		
		// %= 나머지
		int num4 = 30;
		num4 /= 2;
		
//		if(num4 % 2 == 0) {   // 몫과 나머지 활용
//			System.out.println("num4는 짝수입니다.");
//		} else {
//			System.out.println("num4는 홀수입니다.");
//		}
	// ? 가 if 역할 // 조건만족하면 1값을 반환하고 false이면 0을 반환  = 대입연산자   ==비교연산자 
		boolean result = true;
		String result1 = (num4 % 2)==0 ? "True" : "False" ;
		System.out.println(result1);
		
		//true값을 result에 담아라
		
		
		
	}
		
		
}


