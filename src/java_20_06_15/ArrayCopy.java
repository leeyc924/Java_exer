package java_20_06_15;

public class ArrayCopy {
	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3 }, { 2, 3, 4 }, { 3, 4, 5 } };
		int[][] copy = new int[3][3];
		for (int i = 0; i < matrix.length; i++) {
			System.arraycopy(matrix[i], 0, copy[i], 0, matrix[i].length);
		}
		for (int i = 0; i < copy.length; i++) {
			for (int j = 0; j < copy[i].length; j++) {
				System.out.printf("%4d", copy[i][j]);
			}
			System.out.println();
		}
	}
}
