package java_20_07_05;

public class AutoCar extends Car {

	public void load() {
		System.out.println("���� �ƽ��ϴ�.");
	}

	@Override
	public void run() {
		System.out.println("�ڵ����� �޸��ϴ�.");
	}

	@Override
	public void refuel() {
		System.out.println("�ֹ����� ���� �մϴ�.");
	} 
}
