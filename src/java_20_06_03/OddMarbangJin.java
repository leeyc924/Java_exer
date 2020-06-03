package java_20_06_03;

public class OddMarbangJin {
	public static void main(String[] args) {
		int n = 3;
		int[][] square = new int[n][n];
		int num = 1;
		int y = 0;
		int x = n / 2;
		for (int i = 0; i < n * n; i++) {
			square[y][x] = num;
			int originX = x;
			int originY = y;
			if (x - 1 < 0) {
				x = n - 1;
			} else {
				x--;
			}
			if (y - 1 < 0) {
				y = n - 1;
			} else {
				y--;
			}
			if (square[y][x] > 0) {
				y = originY + 1;
				x = originX;
			}
			num++;
		}
		for (int i = 0; i < square.length; i++) {
			for (int j = 0; j < square[i].length; j++) {
				System.out.printf("%4d", square[i][j]);
			}
			System.out.println();
		}
	}
}
