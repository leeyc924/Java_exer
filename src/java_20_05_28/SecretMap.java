package java_20_05_28;

public class SecretMap {

	public static void main(String[] args) {
		int n = 5;
		int[] arr1 = { 9, 20, 28, 18, 11 };
		int[] arr2 = { 30, 1, 21, 17, 28 };
		String[] answer = new String[n];
		for (int i = 0; i < n; i++) {
			answer[i] = Integer.toBinaryString(arr1[i] | arr2[i]);
			int a = n - answer[i].length();
			for (int j = 0; j < a; j++) {
				answer[i] = "0" + answer[i];
			}
			answer[i] = answer[i].replace("0", " ").replace("1", "#");
			System.out.println(answer[i]);
		}
	}
}
