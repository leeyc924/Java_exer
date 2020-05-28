package java_20_05_28;

import java.util.ArrayList;
import java.util.List;

public class DartGame {
	public static void main(String[] args) {
		String dartResult = "1D2S3T*";
		int answer = 0;
		List<Integer> score = new ArrayList<Integer>();
		String[] dart = dartResult.split("");
		for (int i = 0; i < dart.length; i++) {
			if (dart[i].matches("^[2-9]")) {
				score.add(Integer.parseInt(dart[i]));
			} else if (dart[i].equals("1")) {
				if (dart[i + 1].equals("0")) {
					score.add(10);
					i++;
				} else {
					score.add(1);
				}
			} else if (dart[i].equals("0")) {
				score.add(0);
			} else if (dart[i].equals("S")) {
				score.set(score.size() - 1, (int) Math.pow(score.get(score.size() - 1), 1));
			} else if (dart[i].equals("D")) {
				score.set(score.size() - 1, (int) Math.pow(score.get(score.size() - 1), 2));
			} else if (dart[i].equals("T")) {
				score.set(score.size() - 1, (int) Math.pow(score.get(score.size() - 1), 3));
			} else if (dart[i].equals("#")) {
				score.set(score.size() - 1, score.get(score.size() - 1) * (-1));
			} else if (dart[i].equals("*")) {
				if (score.size() > 1) {
					score.set(score.size() - 1, score.get(score.size() - 1) * 2);
					score.set(score.size() - 2, score.get(score.size() - 2) * 2);
				} else if (score.size() == 1) {
					score.set(score.size() - 1, score.get(score.size() - 1) * 2);
				}
			}
		}
		System.out.println(score);
		for (int j = 0; j < score.size(); j++) {
			answer += score.get(j);
		}
		System.out.println(answer);
	}
}
