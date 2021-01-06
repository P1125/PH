package variable;

public class DataTypeExample {
public static void main(String[] args) {
	byte num1 = 12;
	short num2 = 128;
	int num3 = 1000000000;
	long num4 = 1000000000000000L;
	
	byte val1 = 10;
	num3 = val1; // 자동변환 promotion
	//사칙연산 + int형으로 바꿔 계산하겟다
	byte result =(byte) (num1 + val1); //강제 형 변환 int->byte
	
	num1 = 120; // -128~127 
	for(int i = 0; i < 20; i++){// ++ num에 +1을하는데 증가형태로쓰면바이트타입
		System.out.println(num1++);
}
	char char1 = 97; // 정수형값이 있는 캐릭터타입  ++ 1씩증가해서 출력하면 abc...x가나온다
	for(int i = 0; i < 24; i++)
	System.out.println(char1++);
	
	
	
	float floatVal = 4.567F; //flat타입의 실수입니다
	double doubleVal = 3.4567; // 실수형인데 더블타입이다
	
	//기본데이터 유형들이다
	
	
	
	
}
}
