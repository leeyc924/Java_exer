package java_20_06_18;

import java.util.*;

public class LandFishing {	//바로아래행을 제외하고 모두더한뒤 최댓값을 answer 에 할당
	public static void main(String[] args) {
		int[][] land = { { 1, 2, 3, 5 }, { 5, 6, 7, 8 }, { 4, 3, 2, 1 } };
		int answer = 0;
		for (int i = 1; i < land.length; i++) {
			for (int j = 0; j < land[0].length; j++) {
				int sum = 0;
				for (int k = 0; k < land[0].length; k++) {
					if (k == j)
						continue;
					else
						sum = Math.max(sum, land[i - 1][k]);
				}
				land[i][j] += sum;
			}
		}
		Arrays.sort(land[land.length - 1]);
		answer = land[land.length - 1][land[0].length - 1];
		System.out.println(answer);
	}
}
