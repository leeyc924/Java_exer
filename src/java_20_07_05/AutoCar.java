package java_20_07_05;

public class AutoCar extends Car {

	public void load() {
		System.out.println("짐을 싣습니다.");
	}

	@Override
	public void run() {
		System.out.println("자동차가 달립니다.");
	}

	@Override
	public void refuel() {
		System.out.println("휘발유를 주유 합니다.");
	} 
}
