package java_20_06_20;

public class StrangeString {
	public static void main(String[] args) {
		String s = "try hello world";
		String[] str = s.split("");
		String answer = "";
		int cnt = 0;
		for (int i = 0; i < str.length; i++) {
			if (!str[i].equals(" ")) {
				if (cnt % 2 == 0) {
					str[i] = str[i].toUpperCase();
				} else {
					str[i] = str[i].toLowerCase();
				}
				cnt++;
			}else 
				cnt = 0;
			answer += str[i];
		}
		System.out.println(answer);
	}
}
