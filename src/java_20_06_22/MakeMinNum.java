package java_20_06_22;

import java.util.*;

public class MakeMinNum {
	public static void main(String[] args) {
		int[] A = { 1, 4, 2 };
		int[] B = { 5, 4, 4 };
		Arrays.sort(A);
		Arrays.sort(B);
		int answer = 0;
		for (int i = 0; i < A.length; i++) {
			answer += A[i] * B[A.length - 1 - i];
		}
		System.out.println(answer);
	}
}