package iteration;

public class ForExample {
	public static void main(String[] args) {
		int sum = 0; // sum = sum + 10 ; (원래 sum값에 sum+10을더해넣어라)
		for(int i=0; i<=10; i++) { // for ~동안에  i는 int형태  i<10(조건식)을 만족할동안 i를 ++ 1씩증가
			sum += 10; 
			System.out.println("i:" + i);	// i가 0부터시작해서 0~9 총 10번 i=0 / i=1이면 9번//반복조건을만족하면 구문은 sum += 10 실행
		}                          // i +=2 증감식   w
		
		System.out.println("sum:" + sum);
	}
}
