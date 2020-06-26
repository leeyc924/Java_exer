package java_20_06_26;

import java.util.*;

public class NumBaseball {
	public static void main(String[] args) {
		int[][] baseball = { { 123, 1, 1 }, { 356, 1, 0 }, { 327, 2, 0 }, { 489, 0, 1 } };
		Stack<String> stack = new Stack<>(); // ���� 3���� �����Ͽ� ������ ����� ���� ���ÿ� �߰�
		for (int i = 1; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				for (int k = 0; k < 10; k++) {
					if (i != j && j != k && i != k) {
						stack.add(String.valueOf(i * 100 + j * 10 + k));
					}
				}
			}
		}
		Stack<String> temp = new Stack<>();
		boolean flag = true;
		while (!stack.isEmpty()) {
			String num = stack.pop();
			for (int i = 0; i < baseball.length && flag; i++) {
				int strike = strike(num, String.valueOf(baseball[i][0])); // ��Ʈ����ũ �Ǻ�
				int ball = ball(num, String.valueOf(baseball[i][0])) - strike; // �� �Ǻ�
				if (strike != baseball[i][1] || ball != baseball[i][2]) {	//��Ʈ����ũ ���� �Ǵ� �������� ����������
					flag = false;
				}
			}
			if (flag) {
				temp.add(num);
			}
			flag = true;
		}
		System.out.println(temp.size());
	}

	public static int strike(String num, String target) {
		int cnt = 0;
		for (int i = 0; i < target.length(); i++) {
			cnt = num.charAt(i) == target.charAt(i) ? cnt + 1 : cnt;
		}
		return cnt;
	}

	public static int ball(String num, String target) {
		int cnt = 0;
		for (int i = 0; i < target.length(); i++) {
			cnt = num.contains(String.valueOf(target.charAt(i))) ? cnt + 1 : cnt; // �ش� ���ڰ� ���Ե��ִ��� ���� ����
		}
		return cnt;
	}
}
