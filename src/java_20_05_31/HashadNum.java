package java_20_05_31;

public class HashadNum {
	public static void main(String[] args) {
		boolean answer = true;
		int x = 10;
		int y = x;
		int sum = 0;
		while (y > 0) {
			sum += y % 10;
			y /= 10;
		}
		if (x % sum != 0)
			answer = false;
		System.out.println(answer);
	}
}
