package java_20_06_02;

public class HidePhoneNumber {
	public static void main(String[] args) {
		String phone_number = "01033334444";
		char[] ch = phone_number.toCharArray();
		for (int i = 0; i < ch.length - 4; i++) {
			ch[i] = '*';
		} 
		System.out.println(String.valueOf(ch));
	} 
}
