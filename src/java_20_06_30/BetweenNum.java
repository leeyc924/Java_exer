package java_20_06_30;

public class BetweenNum {
	public static void main(String[] args) {
		int a = 5;
		int b = 3;
		long answer = 0;
		if (a < b) {
			for (int i = a; i <= b; i++)
				answer += i;
		} else if (b < a) {
			for (int i = b; i <= a; i++)
				answer += i;
		} else {
			answer = a;
		}
		System.out.println(answer);
	}
}

/*
 * �׽�Ʈ 1 �� ��� (0.81ms, 52MB) 
 * �׽�Ʈ 2 �� ��� (0.82ms, 52.6MB) 
 * �׽�Ʈ 3 �� ��� (0.81ms, 52.3MB) 
 * �׽�Ʈ 4 �� ��� (14.75ms, 53.1MB) 
 * �׽�Ʈ 5 �� ��� (10.59ms, 52.2MB) 
 * �׽�Ʈ 6 �� ��� (9.47ms, 50.9MB) 
 * �׽�Ʈ 7 �� ��� (5.62ms, 50.1MB) 
 * �׽�Ʈ 8 �� ��� (8.20ms, 52.5MB) 
 * �׽�Ʈ 9 �� ��� (7.06ms, 50.4MB) 
 * �׽�Ʈ 10 �� ��� (3.60ms, 50.9MB) 
 * �׽�Ʈ 11 �� ��� (0.85ms, 52.5MB) 
 * �׽�Ʈ 12 �� ��� (1.13ms, 52.4MB) 
 * �׽�Ʈ 13 �� ��� (1.00ms, 50.6MB) 
 * �׽�Ʈ 14 �� ��� (0.85ms, 50.4MB) 
 * �׽�Ʈ 15 �� ��� (0.85ms, 53MB) 
 * �׽�Ʈ 16 �� ��� (0.77ms, 52.7MB)
 */