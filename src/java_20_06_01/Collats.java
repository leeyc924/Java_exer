package java_20_06_01;

public class Collats {
	public static void main(String[] args) {
		int answer = 0;
		long num = 626331;
		while (num != 1) {
			if (num % 2 == 0) {
				num /= 2;
			} else {
				num = num * 3 + 1;
			}
			answer++;
		}
		if (answer > 500)
			System.out.println(-1);
		else
			System.out.println(answer);
	}
}
