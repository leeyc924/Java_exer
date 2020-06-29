package java_20_06_29;

import java.util.*;

public class CallBy {
	int x;

	public CallBy(int x) {
		this.x = x;
	}

	public static void main(String[] args) {
		int n = 10;
		int[] arr = { 10, 20 };
		String str = "a";
		List<Integer> list = new ArrayList();
		CallBy c = new CallBy(10);

		changeVar(n);
		changeArr(arr);
		changeStr(str);
		changeList(list);
		changeObj(c);

		System.out.println(n);
		System.out.println(Arrays.toString(arr));
		System.out.println(str);
		System.out.println(list);
		System.out.println(c.x);
	}

	public static void changeVar(int n) {
		n = 100;
	}

	public static void changeArr(int[] arr) {
		arr[0] = 100;
		arr[1] = 200;
	}

	public static void changeStr(String str) {
		str = "b";
	}

	public static void changeList(List<Integer> list) {
		list.add(1);
	}

	public static void changeObj(CallBy c) {
		c.x = 100;
	}
}
