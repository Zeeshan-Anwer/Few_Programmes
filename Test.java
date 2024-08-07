
public class Test {

	public static void main(String[] args) {
		System.out.println(sol(123, 456));
	}

	public static int sol(int a, int b) {

		int i = 1, num1 = a, num2 = b, rem = 0, res = 0, sum = 0;
		// while (num2 > 0) {
		for (int j = 0; num2 > 0; j++) {

			rem = num2 % 10;
			num2 = num2 / 10;
			res = rem * num1;

			if (j != 0) {
				i = i * 10;
				res = res * i;
			}
			sum += res;

		}
		return sum;
	}

}
