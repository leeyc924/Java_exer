package java_20_06_12.Lotto;

import java.util.Arrays;

public class Lotto6Num {
	private int[] lots;
	private int base;
	private int ballNum;

	public Lotto6Num(int base, int ballNum) {
		this.ballNum = ballNum;
		this.base = base;
		lots = new int[ballNum];
	}

	public Lotto6Num() {
		this(45, 6);
	}

	public void print() {
		for (int i = 0; i < lots.length; i++) {
			if (i == lots.length - 1) {
				System.out.printf("%d ", lots[i]);
			} else {
				System.out.printf("%d, ", lots[i]);
			}
		}
		System.out.println();
	}

	private int rand() {
		return (int) (Math.random() * base) + 1;
	}

	public boolean contain(int n) {
		boolean isC = false;
		for (int i = 0; i < lots.length; i++) {
			if (lots[i] == n) {
				isC = true;
				break;
			}
		}
		return isC;
	}

	public void make() {
		Arrays.fill(lots, 0);
		int count = 0;
		while (count != ballNum) {
			int temp = rand();
			if (!contain(temp)) {
				lots[count++] = temp;
			}
		}
		Arrays.sort(lots);
	}

	public int[] getLots() {
		return lots;
	}
}
