package java_20_06_12;

import java.util.Scanner;

public class GuGu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���: ");
		int n = sc.nextInt();
		sc.close();
		int num = 1;
		int[][] matrix = new int[n + 1][n + 1];	//
		for (int i = 1; i < matrix.length; i++) {	//���ظ�����ֱ�
			matrix[0][i] = num;
			matrix[i][0] = num++;
		}
		for (int i = 1; i < matrix.length; i++) {	//��������Ŀϼ�
			for (int j = 1; j < matrix[i].length; j++) {
				matrix[i][j] = matrix[0][j] * matrix[i][0];
			}
		}
		for (int i = 0; i < matrix.length; i++) {	//���
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.printf("%4d", matrix[i][j]);
			}
			System.out.println();
		}
	}
}
