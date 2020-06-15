package java_20_06_15;

public class CorrectBracket {
	public static void main(String[] args) {
		String s = "()(()()()())()()()()";
		boolean answer = true;
		for (int i = 0; i < s.length(); i++) {
			int cnt = 0;
			if (s.charAt(i) == '(') {
				cnt++;
				for (int j = i + 1; j < s.length(); j++) {
					if (s.charAt(j) == '(') {
						cnt++;
					} else if (s.charAt(j) == ')') {
						cnt--;
					}
					i++;
					if (cnt == 0) {
						break;
					}
				}
				if (cnt != 0) {
					answer = false;
					break;
				}
			} else if (s.charAt(i) == ')') {
				answer = false;
				break;
			}
		}
		System.out.println(answer);
	}
}
