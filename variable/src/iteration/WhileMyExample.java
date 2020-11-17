package iteration;

public class WhileMyExample {

	public static void main(String[] args) {
		// 1부터 10까지 합

		int i = 0, sum = 0;
		while (true) {
			sum += i;
			if (i ==10) {
				break;
				
			}
			i++;

		}
		System.out.println("1부터 10까지합:" + sum);
	}
}
