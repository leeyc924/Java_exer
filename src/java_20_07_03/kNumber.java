package java_20_07_03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * 2020.04.11
 */
public class kNumber {
	public static void main(String[] args) {
		int[] array = { 1, 5, 2, 6, 3, 7, 4 };
		int[][] commands = { { 2, 5, 3 }, { 4, 4, 1 }, { 1, 7, 3 } };
		List<Integer> list = new ArrayList<Integer>();
		int[] answer = new int[commands.length];
		for (int i = 0; i < commands.length; i++) {
			for (int j = commands[i][0] - 1; j < commands[i][1]; j++) {
				list.add(array[j]);
			}
			Collections.sort(list);
			answer[i] = list.get(commands[i][2] - 1);
			list.clear();
		}
		for (int i = 0; i < 3; i++) {
			System.out.println(answer[i]);
		}
	} 
}

/*
 * �׽�Ʈ 1 �� ��� (1.56ms, 49.9MB)
 * �׽�Ʈ 2 �� ��� (1.71ms, 52.2MB)
 * �׽�Ʈ 3 �� ��� (1.59ms, 52MB) 
 * �׽�Ʈ 4 �� ��� (1.52ms, 52.5MB) 
 * �׽�Ʈ 5 �� ��� (1.83ms, 50.9MB) 
 * �׽�Ʈ 6 �� ��� (1.55ms, 52MB) 
 * �׽�Ʈ 7 �� ��� (1.81ms, 53MB)
 */