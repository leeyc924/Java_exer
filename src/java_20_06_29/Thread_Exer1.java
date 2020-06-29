package java_20_06_29;

class ThreadWithClass extends Thread {
	public void run() {
		String[] a = {"a","b","c","d","e"};
		for (int i = 0; i < 5; i++) {
			System.out.println(getName()+" "+a[i]);	//현재 실행중인 스레드의 이름을 반환
			try {
				Thread.sleep(10);	//0.01초간 스레드를 멈춤
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class ThreadWithRunnable implements Runnable {
	public void run() {
		String[] a= {"가","나","다","라","마"};
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName()+" "+a[i]);	//현재 실행중인 스레드의 이름을 반환
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class Thread_Exer1 {
	public static void main(String[] args) {
		ThreadWithClass thread1 = new ThreadWithClass();	//Thread클래스를 상속받는 방법

		Thread thread2 = new Thread(new ThreadWithRunnable());	//Runnable 인터페이스를 구현하는 방법

		thread1.start();	//스레드 실행
		thread2.start();	//스레드 실행
	}
}