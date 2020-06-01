package java_20_06_02;

import java.util.*;

public class MinNumRemove {
	public static void main(String[] args) {
		int[] arr = { 4, 3, 2, 1 };
		List<Integer> list = new ArrayList<Integer>();
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println(min);
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == min)
				continue;
			list.add(arr[i]);
		}
		System.out.println(list);
		if (arr.length == 1) { 
			int[] answer = { -1 };
			System.out.println(answer);
		} else {
			int[] answer = new int[arr.length - 1];
			for (int i = 0; i < list.size(); i++) {
				answer[i] = list.get(i);
			}
			System.out.println(Arrays.toString(answer));
		}
	}
}
