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
		String answer = "김서방은 " + x + "에 있다";
		System.out.println(answer);
	}
} 