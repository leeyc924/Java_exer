package java_20_06_10;

public class JadenCase {
	public static void main(String[] args) {
		String s = "for the last week";
		boolean isNextUpper = true;
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (isNextUpper) {
				sb.append(Character.toUpperCase(c));
				isNextUpper = false;
			} else {
				sb.append(Character.toLowerCase(c));
			}
			if (c == ' ') {
				isNextUpper = true;
			}
		}
		String answer = sb.toString();
		System.out.println(answer);
	}
}

//		String answer = "";
//		String[] sList = s.split("");
//		int cnt = 0;
//		for (int i = 0; i < sList.length; i++) {
//			if (sList[i].equals(" ")) {
//				cnt = 0;
//			} else {
//				if (cnt == 0) {
//					sList[i] = sList[i].toUpperCase();
//					cnt++;
//				} else {
//					sList[i] = sList[i].toLowerCase();
//				}
//			}
//			answer += sList[i];
//		}