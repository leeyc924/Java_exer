package java_20_05_30;

public class GCD_LCM {
	public static void main(String[] args) {
		int n = 2;
		int m = 5;
		int r = 1;
		int[] answer = new int[2];
		int tmp1 = n;
		int tmp2 = m;
		if (n < m) {
			n = tmp2;
			m = tmp1;
		} 
		while (r > 0) {
			r = n % m;
			n = m;
			m = r;
		}
		answer[0] = n;
		answer[1] = tmp1 * tmp2 / n;
		System.out.println(answer[0] + " " + answer[1]);

	}
}