package java_20_05_29;

import java.util.*;

public class failureRate {
	public static void main(String[] args) {
		int N = 5;
		int[] stages = { 2, 1, 2, 6, 2, 4, 3, 3 };
		int[] fail = new int[N];
		double[] failRate = new double[N];
		int clearStatges = stages.length;
		int[] answer = new int[N];
		for (int i = 0; i < N; i++) {
			fail[i] = 0;
		}
		for (int i = 0; i < stages.length; i++) {
			if (stages[i] <= N)
				fail[stages[i] - 1] = fail[stages[i] - 1] + 1;
		}
		Set<Double> set = new HashSet<Double>();
		for (int i = 0; i < N; i++) {
			set.add((double) (fail[i]) / clearStatges);
			clearStatges -= fail[i];
		}
		System.out.println("answer = " + Arrays.toString(answer));
		System.out.println("fail = " + Arrays.toString(fail));
		System.out.println("failRate = " + Arrays.toString(failRate));
	}
}