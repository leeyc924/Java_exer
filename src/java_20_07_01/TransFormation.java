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
 * �׽�Ʈ 1 �� ��� (33.71ms, 55.7MB) 
 * �׽�Ʈ 2 �� ��� (34.03ms, 53.8MB) 
 * �׽�Ʈ 3 �� ��� (34.30ms, 51.9MB) 
 * �׽�Ʈ 4 �� ��� (35.14ms, 54MB) 
 * �׽�Ʈ 5 �� ��� (34.25ms, 53.5MB) 
 * �׽�Ʈ 6 �� ��� (31.66ms, 52MB) 
 * �׽�Ʈ 7 �� ��� (34.12ms, 52.2MB) 
 * �׽�Ʈ 8 �� ��� (34.77ms, 54.6MB) 
 * �׽�Ʈ 9 �� ��� (34.13ms, 54.2MB) 
 * �׽�Ʈ 10 �� ��� (33.37ms, 54.2MB) 
 * �׽�Ʈ 11 �� ��� (34.78ms, 52MB) 
 * �׽�Ʈ 12 �� ��� (35.37ms, 53.6MB) 
 * �׽�Ʈ 13 �� ��� (31.78ms, 53.8MB) 
 * �׽�Ʈ 14 �� ��� (33.31ms, 51.3MB)
 */
