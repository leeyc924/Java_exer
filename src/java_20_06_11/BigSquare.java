package java_20_06_11;

import java.util.Arrays;

public class BigSquare {
	public static void main(String[] args) {

		int[][] board = { { 0, 1, 1, 1 }, { 1, 1, 1, 1 }, { 1, 1, 1, 1 }, { 0, 0, 1, 0 } };
		int answer = 0;
		int up, left, upleft = 0;
		int min = 0;
		for (int i = 1; i < board.length; i++) {
			for (int j = 1; j < board[i].length; j++) {
				if (board[i][j] == 1) {
					up = board[i - 1][j];
					left = board[i][j - 1];
					upleft = board[i - 1][j - 1];
					min = Math.min(up, left);
					min = Math.min(min, upleft);
					board[i][j] = min + 1;
				}
			}
		}
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				if (answer < board[i][j])
					answer = board[i][j];
			}
		}
		System.out.println(Arrays.toString(board[0]));
		System.out.println(Arrays.toString(board[1]));
		System.out.println(Arrays.toString(board[2]));
		System.out.println(Arrays.toString(board[3]));
		System.out.println(answer * answer);
	}
}
