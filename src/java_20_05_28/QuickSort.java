package java_20_05_28;

import java.util.Arrays;

public class QuickSort {
	public static void main(String[] args) {
		int[] n = { 2, 7, 5, 8, 7, 1, 3, 15, 63, 780, 5456, 21, 5, 4, 7, 64, 12, 3, 4, 86, 1, 32 };
		quickSort(n);
		System.out.println(Arrays.toString(n));
	}

	public static void quickSort(int[] n) {
		sort(n, 0, n.length - 1);
	}

	public static void sort(int[] n, int left, int right) {
		if (left >= right)
			return;

		int mid = partition(n, left, right);
		sort(n, left, mid - 1);
		sort(n, mid, right);
	}

	public static int partition(int[] n, int left, int right) {
		int mid = n[(left + right) / 2];
		while (left <= right) {
			while (n[left] < mid)
				left++;
			while (n[right] > mid)
				right--;
			if (left <= right) {
				swap(n, left, right);
				left++;
				right--;
			}
		}
		return left;
	}

	public static void swap(int[] n, int i, int j) {
		int temp = n[i];
		n[i] = n[j];
		n[j] = temp;
	}
}
