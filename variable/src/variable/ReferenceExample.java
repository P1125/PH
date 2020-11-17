package variable;

public class ReferenceExample {
public static void main(String[] args) {
	String str1 = "Hello1";// 주소값..  str에 담겨있다
	String str2 = "Hello2";// string이 클래스 경우에 변수str선언하면 실제 값이 아니라 주소값이 담긴다
	String str3 = new String("Hello3");// 그 주소값을 만드는게 new다 메모리에 가보면 찾지못하지만
	if (str1.equals(str3)) {                 // new는 새로운 주소값을 만들어 준다.
 		System.out.println("동일한 주소값.");   //주소값이 담겨진다
	}else {
		System.out.println("다른 주소값."); 
	}
}
}
