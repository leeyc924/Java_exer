package java_20_06_29;

import java.util.*;

public class Carpet {
	public static void main(String[] args) {
		int brown = 10;
		int yellow = 2;
		int[] answer = new int[2];
		int width = 0;
		int height = 0;

		for (int i = 1; i <= yellow / 2 + 1; i++) {
			width = i;
			height = (yellow % i == 0) ? yellow / i : yellow / i + 1;
			if (width * 2 + height * 2 + 4 == brown)
				break;
		}

		answer[0] = Math.max(width + 2, height + 2);
		answer[1] = Math.min(width + 2, height + 2);

		System.out.println(Arrays.toString(answer));
	}
}
