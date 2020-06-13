package java_20_06_13;

public class Safe {

	public static void main(String[] args) {
		int sa = 0;
		int fe = 0; 
		int len = 5; // 금고크기
		String[][] num = { { "2D", "3R", "1D", "1L", "4D" }, { "1U", "3D", "2L", "1R", "2D" },
				{ "1D", "2U", "1D", "2L", "1L" }, { "4R", "2R", "1L", "2U", "1U" }, { "2R", "2R", "2U", "4U", "4L" } };
		int overlap = 0;
		for (int i = 0; i < len; i++) { 
			for (int j = 0; j < len      ; j++) {
				int x = j;
				int y = i;
				int run = 0;
				String[][] safe = new String[len][len];
				while (run < len * len) {
					if (safe[y][x] == null) {
						safe[y][x] = num[y][x];
					} else if (safe[y][x] != null) {
						break;
					}
					int numOfMove = Integer.parseInt(num[y][x].replaceAll("[A-Z]", "")); // 이동수
					char direction = num[y][x].charAt(1); // 방향
					switch (direction) {
					case 'U':
						y -= numOfMove;
						break;
					case 'D':
						y += numOfMove;
						break;
					case 'R':
						x += numOfMove;
						break;
					case 'L':
						x -= numOfMove;
						break;
					}
					if (run == len * len - 1) {
						sa = i + 1;
						fe = j + 1;
						overlap++;
					}
					run++;
				}
			}
		}
		if (overlap == 1) {
			System.out.println(sa + " " + fe);
		} else if (overlap >= 2) {
			System.out.println("THIEF LOVE IT!");
		} else if (overlap == 0) {
			System.out.println("TOO SAFE");
		}
	}
}
