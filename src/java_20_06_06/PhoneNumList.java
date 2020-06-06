package java_20_06_06;

import java.util.*;

public class PhoneNumList {
	public static void main(String[] args) {
		String[] phone_book = { "119", "97674223", "1195524421" };
		boolean answer = true;
		Arrays.sort(phone_book);
		for (int i = 1; i < phone_book.length; i++) {
			if (phone_book[i].startsWith(phone_book[0]))
				answer = false;
		}
		System.out.println(answer);

	}
}
