package java_20_07_02;

public class Mellon {

	public static void main(String[] args) {
		int n = 4;
		char[] str = { '��', '��' };
		String answer = "";
		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				answer += str[0];
			} else {
				answer += str[1];
			}
		}
		System.out.println(answer);
	}
}

/* �׽�Ʈ 1 ��	��� (32.81ms, 55.8MB)
 * �׽�Ʈ 2 ��	��� (44.17ms, 65.4MB)
 * �׽�Ʈ 3 ��	��� (38.58ms, 61.6MB)
 * �׽�Ʈ 4 ��	��� (57.34ms, 77.3MB)
 * �׽�Ʈ 5 ��	��� (43.73ms, 61.4MB)
 * �׽�Ʈ 6 ��	��� (30.56ms, 55.4MB)
 * �׽�Ʈ 7 ��	��� (29.01ms, 53.3MB)
 * �׽�Ʈ 8 ��	��� (27.10ms, 55.1MB)
 * �׽�Ʈ 9 ��	��� (41.91ms, 54.6MB)
 * �׽�Ʈ 10 ��	��� (28.20ms, 55MB)
 * �׽�Ʈ 11 ��	��� (28.11ms, 54.3MB)
 * �׽�Ʈ 12 ��	��� (27.16ms, 55.1MB)
 * �׽�Ʈ 13 ��	��� (28.42ms, 53.3MB)
 * �׽�Ʈ 14 ��	��� (29.03ms, 55.4MB)
 * �׽�Ʈ 15 ��	��� (84.64ms, 128MB)
 * �׽�Ʈ 16 ��	��� (27.02ms, 55.4MB)
 */