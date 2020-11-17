package variable;

public class ArrayExample {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;

		// [] 는 배열이라는뜻
		int[] numbers = { 10, 20, 30, 40, 50 }; // 변수하나로 여러값을 가져올수있다.
		numbers[1] = 200; // 읽을수도있고 값을 넣을수도 있다. 배열
		System.out.println(numbers[1]); // numbers의 첫번째값을가져오시오 [0] num1의10이아닌 numbers

		int sum = 0;

		for (int i = 0; i < 5; i++) {
			System.out.println(numbers[i]);
			sum += numbers[i];
		}
		System.out.println("합:" + sum);
		
		String[] strings =  {"Hello","World", 
					"Nice","To", "Meet", "you"};
		for(int i=0; i < strings.length; i++) {
			strings [2] = "Good";
			strings [4] = "See" ;
			
			System.out.println(strings[i]);//strings.lenght의 배열은5 
		}
	}

}
