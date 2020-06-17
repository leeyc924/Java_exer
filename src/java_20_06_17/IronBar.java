package java_20_06_17;

import java.util.*;

public class IronBar {
	public static void main(String[] args) {
		String arrangement = "()(((()())(())()))(())";
		System.out.println(arrangement);
		int sol1 = solution1(arrangement);
		int sol2 = solution2(arrangement);
		System.out.println(sol1);
		System.out.println(sol2);
	}

	public static int solution1(String arrangement) {
		String copyArray = arrangement.replace("()", "0");
		int answer = 0;
		ArrayList<Character> copy = new ArrayList<Character>();
		for (int i = 0; i < copyArray.length(); i++) {
			copy.add(copyArray.charAt(i));
		}
		ArrayList<Character> stack = new ArrayList<Character>();
		for (int i = 0; i < copy.size(); i++) {
			if (copy.get(i) == '(') {
				stack.add(copy.get(i));
			} else if (copy.get(i) == ')') {
				stack.remove(stack.size() - 1);
				answer += 1;
			} else if (copy.get(i) == '0') {
				answer += stack.size();
			}
		}
		return answer;
	}

	public static int solution2(String arrangement) {
		int answer = 0;
		Stack<Integer> st = new Stack<>();
		for (int i = 0; i < arrangement.length(); i++) {
			if (arrangement.charAt(i) == '(') {
				st.push(i);
			} else if (arrangement.charAt(i) == ')') {
				if (st.peek() + 1 == i) {
					st.pop();
					answer += st.size();
				} else {
					st.pop();
					answer += 1;
				}
			}
		}
		return answer;
	}
}