package java_20_06_23;

import java.util.*;

public class Printer { 
	public static void main(String[] args) {
		int[] priorities = { 2, 1, 3, 2 };
		int location = 2;
		int answer = 0;
		Queue<Integer> q = new LinkedList<Integer>();
		for (int i : priorities) {
			q.offer(i);
		}
		Arrays.sort(priorities);	
		int length = priorities.length - 1;
		while (!q.isEmpty()) {
			int current = q.poll();
			if (current == priorities[length - answer]) {
				answer++;
				location--;
				if (location < 0) {
					break;
				}
			} else {
				q.offer(current);
				location--;
				if (location < 0) {
					location = q.size() - 1;
				}
			}
		}
		System.out.println(answer);
	}
}
