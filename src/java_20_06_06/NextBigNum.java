package java_20_06_06;

public class NextBigNum {
	public static void main(String[] args) {
		int n = 78;
		int nCount = Integer.bitCount(n);
		while (true) {
			n++;
			int mCount = Integer.bitCount(n);
			if (nCount == mCount)
				break;
		}
		int answer = n;
		System.out.println(answer);
	}
}
