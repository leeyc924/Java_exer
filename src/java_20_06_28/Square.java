package java_20_06_28;

public class Square {
	public static void main(String[] args) {
		int w = 8;
		int h = 12;
		long answer = 0;
		long small, big;
		big = (long) (w >= h ? w : h);
		small = (long) (w < h ? w : h);
		while (small != 0) { // �ִ� �����
			long nmg = big % small;
			big = small;
			small = nmg;
		}
		answer = ((long) w * (long) h) - ((long) w + (long) h - big); // ����*����-�ִ�����
		System.out.println(answer);
	}
}
