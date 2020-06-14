package java_20_06_14;

import java.util.*;

public class Top {
	public static void main(String[] args) {
		int[] heights = { 1, 5, 3, 6, 7, 6, 5 }; 
		int[] answer = new int[heights.length];
		for (int i = 1; i < heights.length; i++) {
			for (int j = i - 1; j >= 0; j--) {
				if (heights[i] < heights[j]) {
					answer[i] = j + 1;
					break;
				}
			}
		}
		System.out.println(Arrays.toString(answer));
	} 
}
 