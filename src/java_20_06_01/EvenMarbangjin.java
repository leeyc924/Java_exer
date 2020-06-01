package java_20_06_01;

import java.util.*;

public class EvenMarbangjin {
	public static void main(String[] args) {
		int[][] square = new int[4][4];
		int num = 0;
		List<Integer> numlist = new ArrayList<Integer>();
		int k = 3;
		System.out.println("===========1===========");
		for (int i = 0; i < square.length; i++) { // 대각선 먼저 채우기
			for (int j = 0; j < square[i].length; j++) {
				num++;
				if (i == j) // 왼쪽 대각선 채우기
					square[i][j] = num;
				else if (j - i == k) { // 오른쪽 대각선 채우기
					square[i][j] = num;
					k -= 2;
				} else // 안채운 숫자 list에 저장
					numlist.add(num);
			}
		}
		println(square); // 첫번째 과정 한후 출력한번
		System.out.println("===========2===========");
		for (int i = square.length - 1; i >= 0; i--) { // 나머지 부분 역순으로 채우기
			for (int j = square[i].length - 1; j >= 0; j--) {
				if (square[i][j] == 0) {
					square[i][j] = numlist.get(0); // list 인덱스0에있는걸 저장
					numlist.remove(0); // 0인덱스삭제 1인덱스가 0인덱스로 땡겨짐
				}
			}
		}
		println(square); // 최종 완료후 출력
	}

	public static void println(int[][] square) {
		for (int i = 0; i < square.length; i++) {
			for (int j = 0; j < square[i].length; j++) {
				System.out.printf("%4d", square[i][j]);
			}
			System.out.println();
		}
	}
}
