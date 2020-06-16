package java_20_06_16;

import java.util.*;

public class FloydAlgorithm {
	int var = 99;
	int[][] W = { { 0, 2, 3, var, 7 }, { 5, 0, var, var, 4 }, { 2, var, 0, 6, var }, { var, var, 3, 0, 4 },
			{ 6, 1, 7, 2, 0 } };

	public static void main(String[] args) {
		FloydAlgorithm dis = new FloydAlgorithm();
		dis.floyd();
		dis.print();
	}

	public void floyd() {
		for (int i = 0; i < W.length; i++) {
			for (int j = 0; j < W.length; j++) {
				for (int k = 0; k < W.length; k++) {
					if (W[j][k] > W[j][i] + W[i][k])
						W[j][k] = W[j][i] + W[i][k];
				}
			}
		}
	}

	public void print() {
		for (int i = 0; i < W.length; i++) {
			for (int j = 0; j < W.length; j++) {
				System.out.printf("%4d", W[i][j]);
			}
			System.out.println();
		}
	}
}