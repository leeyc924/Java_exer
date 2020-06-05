package java_20_06_05;

import java.util.*;

public class PassBridge {
	public static void main(String[] args) {
		int bridge_length = 2;
		int weight = 10;
		int[] truck_weights = { 7, 4, 5, 6 };
		int answer = 1;
		List<Integer> list = new ArrayList<Integer>();
		List<Integer> after = new ArrayList<Integer>();
		int i = 0;
		list.add(truck_weights[0]);
		int sum = list.get(0);
		while (after.size() != truck_weights.length) {
			answer++;
			if (list.size() == bridge_length) {
				if (list.get(0) != 0) {
					after.add(list.get(0));
					sum -= list.get(0);
				}
				list.remove(0);
			}
			if (i != truck_weights.length - 1) {
				if (weight >= (sum + truck_weights[i + 1])) {
					i++;
					list.add(truck_weights[i]);
					sum += truck_weights[i];
				} else {
					list.add(0);
				}
			} else {
				list.add(0);
			}
		}
		System.out.println(answer);
	}
}
