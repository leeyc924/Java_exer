package java_20_06_01;

public class numOfDigit {
	public static void main(String[] args) {
		int n = 132;
		int answer = 0;
		while (n > 0) {
			answer = answer + n % 10;
			n /= 10;
		}
		System.out.println(answer);
	}
}
