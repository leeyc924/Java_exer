package java_20_06_29;

class Thread1 extends Thread {
	@Override
	public void run() {
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
			System.out.println(i + "더하기 결과: " + sum);
		}
		System.out.println("------------------------------");
		System.out.println("1~10합계: " + sum);
	}
}

public class Thread_Exer2 {
	public static void main(String[] args) {
		Thread t = new Thread1();
		t.start();
		int mul = 1;
		for (int i = 1; i <= 10; i++) {
			mul *= i;
			System.out.println(i + "곱하기 결과: " + mul);
		}
		System.out.println("------------------------------");
		System.out.println("1~10의 곱: " + mul);
	}
}
