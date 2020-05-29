package java_20_05_29;

import java.util.*;

public class Lotto {
	public static void main(String[] args) {
		Random random = new Random();
		Set<Integer> randomSet = new HashSet<>(); // 중복없이 랜덤숫자담기위해 set선언
		int[] num = new int[6];
		while (randomSet.size() < 6) {
			randomSet.add(random.nextInt(45) + 1); // 중복없이 1~45까지 숫자 랜덤으로 6개 담음
		}
		Iterator<Integer> iter = randomSet.iterator();
		int i = 0;
		while (iter.hasNext()) { // set -> num에 넣음
			num[i] = iter.next();
			i++;
		}
		Arrays.sort(num); // 오름차순 정렬
		System.out.println(Arrays.toString(num)); // num배열 출력
	}
}
