package java_20_06_03;

public class Six_Marbangjin {
	public static void main(String[] args) {
		int n = 6;
		int[][] matrix = new int[n][n];
		Six_Marbangjin six = new Six_Marbangjin();
		six.makeA(matrix, n);
		six.makeBD(matrix, n);
		six.makeC(matrix, n);
		six.pow(matrix, n);
		six.partition(matrix, n);

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.printf("%4d", matrix[i][j]);
			}
			System.out.println();
		}
	}

	public static int[][] three(int[][] square) { // 3*3마방진
		int num = 1;
		int y = 0;
		int x = 1;
		for (int i = 0; i < 9; i++) {
			square[y][x] = num;
			int originX = x;
			int originY = y;
			if (x - 1 < 0) {
				x = 2;
			} else {
				x--;
			}
			if (y - 1 < 0) {
				y = 2;
			} else {
				y--;
			}
			if (square[y][x] > 0) {
				y = originY + 1;
				x = originX;
			}
			num++;
		}
		return square;
	}

	// 메소드
	public void makeA(int[][] matrix, int n) { // A영역만드는 메소드
		for (int i = 0; i < n / 2; i++) {
			if (i == n / 2 / 2) {
				matrix[i][n / 4] = 3;
			} else {
				matrix[i][n / 4 - 1] = 3;
			}
		}
	}

	public void makeBD(int[][] matrix, int n) { // BD영역만드는 메소드
		for (int i = 0; i < n; i++) {
			for (int j = n / 2; j < n; j++) {
				if (i >= 0 && i < n / 2)
					matrix[i][j] = 2;
				else
					matrix[i][j] = 1;
			}
		}
	}

	public void makeC(int[][] matrix, int n) { // C영역만드는 메소드
		int k = 0;
		for (int i = n / 2; i < n; i++) {
			for (int j = 0; j < n / 2; j++) {
				if (matrix[k][j] == 0)
					matrix[i][j] = 3;
			}
			k++;
		}
	}

	public void partition(int[][] matrix, int n) { // matrix 제작
		int[][] square = new int[3][3];
		square = three(square);
		int y = 0;
		for (int i = 0; i < matrix.length; i++) {
			int x = 0;
			if (y > n / 3)
				y = 0;
			for (int j = 0; j < matrix[i].length; j++) {
				if (x > n / 3)
					x = 0;
				matrix[i][j] += square[y][x];
				x++;
			}
			y++;
		}
	}

	public void pow(int[][] matrix, int n) { // 제곱
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] *= (n / 2) * (n / 2);
			}
		}
	}
}