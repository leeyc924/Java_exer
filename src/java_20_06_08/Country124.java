package java_20_06_08;

public class Country124 {
	public static void main(String[] args) {
		int n = 41;
		String answer = "";
		int share = n;
		int remainder = -1;
		while (share != 0) {
			remainder = share % 3;
			share = share / 3;
			if (remainder == 0) {
				answer = "4" + answer;
				share--;
			} else if (remainder == 1) {
				answer = "1" + answer;
			} else if (remainder == 2) {
				answer = "2" + answer;
			}
		}
		System.out.println(answer);
	}
}