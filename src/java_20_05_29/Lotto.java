package java_20_05_29;

import java.util.*;

public class Lotto {
	public static void main(String[] args) {
		Random random = new Random();
		Set<Integer> randomSet = new HashSet<>(); // �ߺ����� �������ڴ������ set����
		int[] num = new int[6];
		while (randomSet.size() < 6) {
			randomSet.add(random.nextInt(45) + 1); // �ߺ����� 1~45���� ���� �������� 6�� ����
		}
		Iterator<Integer> iter = randomSet.iterator();
		int i = 0;
		while (iter.hasNext()) { // set -> num�� ����
			num[i] = iter.next();
			i++;
		}
		Arrays.sort(num); // �������� ����
		System.out.println(Arrays.toString(num)); // num�迭 ���
	}
}
