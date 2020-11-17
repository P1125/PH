package iteration;

public class ForMyeExample {
	public static void main(String[] args) {
		int sum = 0; // i/sum 값 같이변함
		for (int i = 1; i <=10; i++) {
			if (i % 2 ==0) {
				sum += i;
			}
		}
	System.out.println("sum:" + sum);
	}
}