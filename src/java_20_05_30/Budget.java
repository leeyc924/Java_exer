package java_20_05_30;

import java.util.Arrays;

public class Budget {
	public static void main(String[] args) {
		int[] d = { 1, 3, 2, 5, 4 };
		int budget = 9;
		int answer = 0;
		int sum = 0;
		Arrays.sort(d);
		for (int i = 0; i < d.length; i++) {
			sum += d[i];
			if (sum > budget) {
				break;
			}
			answer++;
		}
		System.out.println(answer);
	}
}
