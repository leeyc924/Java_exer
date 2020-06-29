package java_20_06_29;

class ThreadWithClass extends Thread {
	public void run() {
		String[] a = {"a","b","c","d","e"};
		for (int i = 0; i < 5; i++) {
			System.out.println(getName()+" "+a[i]);	//���� �������� �������� �̸��� ��ȯ
			try {
				Thread.sleep(10);	//0.01�ʰ� �����带 ����
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class ThreadWithRunnable implements Runnable {
	public void run() {
		String[] a= {"��","��","��","��","��"};
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName()+" "+a[i]);	//���� �������� �������� �̸��� ��ȯ
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
		ThreadWithClass thread1 = new ThreadWithClass();	//ThreadŬ������ ��ӹ޴� ���

		Thread thread2 = new Thread(new ThreadWithRunnable());	//Runnable �������̽��� �����ϴ� ���

		thread1.start();	//������ ����
		thread2.start();	//������ ����
	}
}