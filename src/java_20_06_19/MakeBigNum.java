package java_20_06_19;

public class MakeBigNum {
	public static void main(String[] args) {
		String number = "1231234";
		int k = 3;
		StringBuilder answer = new StringBuilder();
		int index = 0;
		for (int i = 0; i < number.length() - k; i++) {
			char max = '0';
			for (int j = index; j <= k + i; j++) {
				if (max < number.charAt(j)) {
					max = number.charAt(j);
					index = j;
				} 
			}
			index++;
			answer.append(max);
			System.out.println(answer.toString());
		}
	}
}
