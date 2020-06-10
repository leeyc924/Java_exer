package java_20_06_11;

public class Fivo {
	public static void main(String[] args) {
		int n = 3;
		int answer = 0;
		if (n == 1 || n == 2)
			answer = 1;
		else {
			int n1 = 1;
			int n2 = 1;
			int sum = 0;
			for (int i = 3; i <= n; i++) {
				sum = n1 + n2;
				sum %= 1234567;
				n1 = n2;
				n2 = sum;
			}
			answer = sum;
		}
		System.out.println(answer);
	}
}
