package java_20_06_03;

import java.util.*;

public class SnailArray {
	public static void main(String[] args) {
		int n = 0;
		Scanner sc = new Scanner(System.in);
		while (n % 2 == 0) {
			System.out.print("Ȧ�� �Է�: ");
			n = sc.nextInt();
			if (n % 2 == 0)
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
		sc.close();
		int num = 1;
		int[][] snail = new int[n][n];
		int end = n - 1; // �� �ε���
		int start = 0; // �����ε���
		for (int k = 0; k < n * 2 - 1; k++) {
			for (int i = start; i <= end; i++) {// �Ʒ���
				snail[i][start] = num++;
			}
			start++;
			for (int i = start; i <= end; i++) {// ������
				snail[end][i] = num++;
			}
			end--;
			start--;
			for (int i = end; i >= start; i--) { // ����
				snail[i][end + 1] = num++;
			}
			start++;
			for (int i = end; i >= start; i--) {// ����
				snail[start - 1][i] = num++;
			}
		}
		for (int i = 0; i < snail.length; i++) {
			for (int j = 0; j < snail[i].length; j++) {
				System.out.printf("%4d", snail[i][j]);
			}
			System.out.println();
		}
	}
}
