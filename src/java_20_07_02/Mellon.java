package java_20_07_02;

public class Mellon {

	public static void main(String[] args) {
		int n = 4;
		char[] str = { '수', '박' };
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

/* 테스트 1 〉	통과 (32.81ms, 55.8MB)
 * 테스트 2 〉	통과 (44.17ms, 65.4MB)
 * 테스트 3 〉	통과 (38.58ms, 61.6MB)
 * 테스트 4 〉	통과 (57.34ms, 77.3MB)
 * 테스트 5 〉	통과 (43.73ms, 61.4MB)
 * 테스트 6 〉	통과 (30.56ms, 55.4MB)
 * 테스트 7 〉	통과 (29.01ms, 53.3MB)
 * 테스트 8 〉	통과 (27.10ms, 55.1MB)
 * 테스트 9 〉	통과 (41.91ms, 54.6MB)
 * 테스트 10 〉	통과 (28.20ms, 55MB)
 * 테스트 11 〉	통과 (28.11ms, 54.3MB)
 * 테스트 12 〉	통과 (27.16ms, 55.1MB)
 * 테스트 13 〉	통과 (28.42ms, 53.3MB)
 * 테스트 14 〉	통과 (29.03ms, 55.4MB)
 * 테스트 15 〉	통과 (84.64ms, 128MB)
 * 테스트 16 〉	통과 (27.02ms, 55.4MB)
 */