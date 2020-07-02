package java_20_07_01;

import java.util.Calendar;

public class TransFormation {
	public static void main(String[] args) {

		int month = 5;
		int day = 24;
		int year = 2016;
		int dayNum = 0;
		String answer="";
		Calendar cal = Calendar.getInstance();
		cal.set(year, month - 1, day);

		dayNum = cal.get(Calendar.DAY_OF_WEEK);
		if (dayNum == 1)
			answer="SUN";
		else if (dayNum == 2)
			answer="MON";
		else if (dayNum == 3)
			answer="TUE";
		else if (dayNum == 4)
			answer="WED";
		else if (dayNum == 5)
			answer="THU";
		else if (dayNum == 6)
			answer="FRI";
		else if (dayNum == 7)
			answer="SAT";
		System.out.println(answer);
	}
}

/*
 * 테스트 1 〉 통과 (33.71ms, 55.7MB) 
 * 테스트 2 〉 통과 (34.03ms, 53.8MB) 
 * 테스트 3 〉 통과 (34.30ms, 51.9MB) 
 * 테스트 4 〉 통과 (35.14ms, 54MB) 
 * 테스트 5 〉 통과 (34.25ms, 53.5MB) 
 * 테스트 6 〉 통과 (31.66ms, 52MB) 
 * 테스트 7 〉 통과 (34.12ms, 52.2MB) 
 * 테스트 8 〉 통과 (34.77ms, 54.6MB) 
 * 테스트 9 〉 통과 (34.13ms, 54.2MB) 
 * 테스트 10 〉 통과 (33.37ms, 54.2MB) 
 * 테스트 11 〉 통과 (34.78ms, 52MB) 
 * 테스트 12 〉 통과 (35.37ms, 53.6MB) 
 * 테스트 13 〉 통과 (31.78ms, 53.8MB) 
 * 테스트 14 〉 통과 (33.31ms, 51.3MB)
 */
