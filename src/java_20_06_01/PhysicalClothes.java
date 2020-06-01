package java_20_06_01;

import java.util.*;

public class PhysicalClothes {
	public static void main(String[] args) {
		int n = 5;
		int[] lost = { 2, 4 };
		int[] reserve = { 3, 5 };
		int answer = 0;
		int[] numList = new int[n];
		for (int i = 0; i < reserve.length; i++) {
			numList[reserve[i] - 1]++;
		}
		System.out.println("¿©¹ú¿Ê " + Arrays.toString(numList));
		for (int i = 0; i < lost.length; i++) {
			numList[lost[i] - 1]--;
		}
		System.out.println("ÀÒÀ½ " + Arrays.toString(numList));

		for (int i = 0; i < n; i++) {
			if (numList[i] == -1) {
				if (i == 0) {
					if (numList[i + 1] == 1) {
						numList[i + 1]--;
						numList[i]++;
					}
				} else if (i > 0 && i < n - 1) {
					if (numList[i - 1] == 1) {
						numList[i - 1]--;
						numList[i]++;
					} else if (numList[i + 1] == 1) {
						numList[i + 1]--;
						numList[i]++;
					}
				} else if (i == n - 1) {
					if (numList[i - 1] == 1) {
						numList[i - 1]--;
						numList[i]++;
					}
				}
			}
		}
		for (int i = 0; i < n; i++) {
			if (numList[i] >= 0) {
				answer++;
			}
		}
		System.out.println(Arrays.toString(numList));
		System.out.println(answer);
	}
}
