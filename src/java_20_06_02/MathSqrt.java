package java_20_06_02;

public class MathSqrt {
	public static void main(String[] args) {
		long n = 121;
		long answer = 0;
		double d = Math.sqrt(n);
		long ip = (long) d;
		double fp = d - (long) d;
		if (fp != 0)
			answer = -1;
		else {
			answer = (long) Math.pow(ip + 1, 2);
		}
		System.out.println(answer);
	} 
}
