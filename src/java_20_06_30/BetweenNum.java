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
 * 테스트 1 〉 통과 (0.81ms, 52MB) 
 * 테스트 2 〉 통과 (0.82ms, 52.6MB) 
 * 테스트 3 〉 통과 (0.81ms, 52.3MB) 
 * 테스트 4 〉 통과 (14.75ms, 53.1MB) 
 * 테스트 5 〉 통과 (10.59ms, 52.2MB) 
 * 테스트 6 〉 통과 (9.47ms, 50.9MB) 
 * 테스트 7 〉 통과 (5.62ms, 50.1MB) 
 * 테스트 8 〉 통과 (8.20ms, 52.5MB) 
 * 테스트 9 〉 통과 (7.06ms, 50.4MB) 
 * 테스트 10 〉 통과 (3.60ms, 50.9MB) 
 * 테스트 11 〉 통과 (0.85ms, 52.5MB) 
 * 테스트 12 〉 통과 (1.13ms, 52.4MB) 
 * 테스트 13 〉 통과 (1.00ms, 50.6MB) 
 * 테스트 14 〉 통과 (0.85ms, 50.4MB) 
 * 테스트 15 〉 통과 (0.85ms, 53MB) 
 * 테스트 16 〉 통과 (0.77ms, 52.7MB)
 */