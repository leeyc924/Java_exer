package java_20_06_02;

public class FindKim {
	public static void main(String[] args) {
		String[] seoul = { "Jane", "Kim" };
		int x = 0; 
		for (int i = 0; i < seoul.length; i++) { 
			if (seoul[i].equals("Kim")) {
				x = i; 
				break;
			}
		}
		String answer = "�輭���� " + x + "�� �ִ�";
		System.out.println(answer);
	}
} 