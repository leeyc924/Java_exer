package java_20_05_31;

import java.util.*;

public class NumSort {
	public static void main(String[] args) {
		long n = 118372;
		long answer = 0;
		long ten = 1;
		List<Long> a = new ArrayList<Long>();
		while (n > 0) {
			a.add(n % 10);
			n /= 10;
		}
		Collections.sort(a);
		for (int i = 0; i < a.size(); i++) {
			answer += a.get(i) * ten;
			ten *= 10;
		}
		System.out.println(answer);
	}
}
