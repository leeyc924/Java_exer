package java_20_06_01;

import java.util.*;

public class EvenMarbangjin {
	public static void main(String[] args) {
		int[][] square = new int[4][4];
		int num = 0;
		List<Integer> numlist = new ArrayList<Integer>();
		int k = 3;
		System.out.println("===========1===========");
		for (int i = 0; i < square.length; i++) { // �밢�� ���� ä���
			for (int j = 0; j < square[i].length; j++) {
				num++;
				if (i == j) // ���� �밢�� ä���
					square[i][j] = num;
				else if (j - i == k) { // ������ �밢�� ä���
					square[i][j] = num;
					k -= 2;
				} else // ��ä�� ���� list�� ����
					numlist.add(num);
			}
		}
		println(square); // ù��° ���� ���� ����ѹ�
		System.out.println("===========2===========");
		for (int i = square.length - 1; i >= 0; i--) { // ������ �κ� �������� ä���
			for (int j = square[i].length - 1; j >= 0; j--) {
				if (square[i][j] == 0) {
					square[i][j] = numlist.get(0); // list �ε���0���ִ°� ����
					numlist.remove(0); // 0�ε������� 1�ε����� 0�ε����� ������
				}
			}
		}
		println(square); // ���� �Ϸ��� ���
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
