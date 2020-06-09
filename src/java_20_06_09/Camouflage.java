package java_20_06_09;

import java.util.HashMap;
import java.util.Iterator;

public class Camouflage {
	public static void main(String[] args) {
		String[][] clothes = { { "yellow_hat", "headgear" }, { "blue_sunglasses", "eyewear" },
				{ "green_turban", "headgear" }, { "crow_mask", "face" }, { "blue_sunglasses", "face" },
				{ "smoky_makeup", "face" } };
		int answer = 1;
		HashMap<String, Integer> map = new HashMap<>();
		for (int i = 0; i < clothes.length; i++) {
			map.put(clothes[i][1], map.getOrDefault(clothes[i][1], 0) + 1);
		}
		Iterator<String> key = map.keySet().iterator();
		while (key.hasNext()) {
			int keyNext = map.get(key.next());
			answer = answer * (keyNext + 1);
		}
		answer--;

		System.out.println(answer);

	}
}
