package java_20_06_16;

import java.util.*;

public class FuncDev {
	public static void main(String[] args) {
		int[] progresses = { 93, 30, 55 };
		int[] speeds = { 1, 30, 5 };
		Queue<Integer> q = new LinkedList<>();
		ArrayList<Integer> list = new ArrayList<Integer>();
		int[] day = new int[progresses.length];
		for (int i = 0; i < progresses.length; i++) {
			progresses[i] = 100 - progresses[i];
			if (progresses[i] % speeds[i] != 0) {
				day[i] = progresses[i] / speeds[i] + 1;
			} else {
				day[i] = progresses[i] / speeds[i];
			}
			q.offer(day[i]);
		}
		int before = q.peek();
		int index = 0;
		list.add(0);
		while (!q.isEmpty()) {
			int out = q.poll();
			if (out <= before) {
				list.set(index, list.get(index) + 1);
			} else {
				before = out;
				index++;
				list.add(1);
			}
		}
		int[] answer = new int[list.size()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i);
		}
		System.out.println(Arrays.toString(answer));

	}
}
