package iteration;

public class ForMultiTable {

	public static void main(String[] args) {
		// for 9번 반복
		int num = 2;
		for (int i = 1; i <= 9; i++) {
			System.out.println(num + "*" + i + "=" + (num * i));
		}
		for (int i = 1; i <= 9; i++) {
			System.out.println("3*" + i + "=" + (3 * i));
		}

		int num3 = 8;
		for (int i = 1; i <= 9; i++) {
			System.out.println(num3 + "*" + i + "=" + (num * i));
		}

		num++;
		for (int i = 1; i <= 9; i++) {
			System.out.println(num + "*" + i + "=" + (num * i));
		}

		
		for (int num4 = 2; num <=9; num++) {
			System.out.println("[" + num3 + "단]");
			for (int i = 1; i <= 9; i++) {
				System.out.println(num4 + "*" + i + "=" + (num * i));
			}
		}

	}
}