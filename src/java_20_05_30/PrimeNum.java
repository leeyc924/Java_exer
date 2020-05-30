package java_20_05_30;

public class PrimeNum {
	public static void main(String[] args) {

		int n = 10;
		int answer = 0;
		boolean[] prime = new boolean[n + 1];
		prime[0] = true;
		prime[1] = true;
		for (int i = 2; i * i <= n; i++) {
			if (!prime[i]) {
				for (int j = i * i; j <= n; j += i)
					prime[j] = true;
			}
		}
		for (int i = 1; i <= n; i++) {
			if (!prime[i]) {
				answer++;
				System.out.println("�Ҽ�: " + i);
			}

		}

	}
}