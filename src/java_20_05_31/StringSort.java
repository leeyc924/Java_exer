package java_20_05_31;

import java.util.ArrayList;
import java.util.Collections;

public class StringSort {
	public static void main(String[] args) {
		String[] strings = { "sun", "bed", "car" };
		int n = 1;
		ArrayList<String> arr = new ArrayList<>();
		for (int i = 0; i < strings.length; i++) {
			arr.add(strings[i].charAt(n) + strings[i]);
		}
		Collections.sort(arr);
		String[] answer = new String[arr.size()];
		for (int i = 0; i < arr.size(); i++) {
			answer[i] = arr.get(i).substring(1, arr.get(i).length());
		}
		for (int i = 0; i < strings.length; i++)
			System.out.println(answer[i]);

	}
}
