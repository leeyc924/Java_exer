package java_20_06_13;

import java.util.*;

public class StockPrice {
	int time;
	int price;

	public StockPrice(int price) {
		this.price = price; 
		this.time = 0;
	} 

	public void plus() {
		time++;
	} 

	public static void main(String[] args) {
		int[] prices = { 1, 2, 3, 2, 3 };
		int[] answer = new int[prices.length];
		List<StockPrice> list = new ArrayList<StockPrice>();
		for (int i : prices) {
			list.add(new StockPrice(i));
		}
		for (int i = 0; i < prices.length - 1; i++) {
			for (int j = i + 1; j < prices.length; j++) {
				list.get(i).plus();
				if (list.get(i).price > list.get(j).price) {
					break;
				}
			}
			answer[i] = list.get(i).time;
		}
		System.out.println(Arrays.toString(answer));
	}
}
