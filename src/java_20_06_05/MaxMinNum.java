package java_20_06_05;

import java.util.*;

public class MaxMinNum {
	public static void main(String[] args) {
		String s = "-1 -2 -3 -4 1 2 3 4";
		String[] splitS = s.split(" ");
		int[] splitN = new int[splitS.length];
		for (int i = 0; i < splitS.length; i++) {
			splitN[i] = Integer.parseInt(splitS[i]);
		}
		Arrays.sort(splitN);
		String answer = "";
		answer = splitN[0] + " " + splitN[splitN.length - 1];
		System.out.println(answer);
	}
}
