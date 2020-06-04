package java_20_06_04;

public class NumExpression {
	public static void main(String[] args) {
		int n = 15;
		int answer = 0;
		for (int i = 1; i <= n / 2 + 1; i++) {
			int sum = 0;
			for (int j = i; j <= n / 2 + 1; j++) {
				sum += j;
				if (sum > n)
					break;
				if (sum == n) {
					answer++;
					break;
				}
			}
		}
		System.out.println(answer);
	}
}
