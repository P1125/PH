package condition;

public class ConditionExample4 {
	public static void main (String[] args ) {	
	 int num1= 15 ;
	 
	 if(num1% 3 == 0 && num1 % 5 == 0) {
		 //3으로도나누어지고 5로도 나누어지면 둘다참일때 실행해라 &&
		 System.out.println("3의배수이고 5의배수인경우");
		 
	 } else if ( num1 % 3 ==0 ) {
		 System.out.println("3의배수");
		 
	 } else if (num1 % 5 == 0){
		 System.out.println("5의배수");
		 
	 } else {
		 System.out.println("기타이다");
	 }
	 }
}