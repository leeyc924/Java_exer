package java_20_06_10;

public class ConversionTable2 {
	public static void main(String[] args) {
		int n = 1;
		String[] str = { "CM", "M", "Inch", "Feet", "Yard", "Mile" };
		double[] conversion = { n, 100 * n, 2.54 * n, 30.48 * n, 91.44 * n, 160934.4 * n }; // È¯»ê
		double[][] table = {
				{ conversion[0], conversion[0] / 100, conversion[0] / 2.54, conversion[0] / 30.48,
						conversion[0] / 91.44, conversion[0] / 160934.4 },
				{ conversion[1], conversion[1] / 100, conversion[1] / 2.54, conversion[1] / 30.48,
						conversion[1] / 91.44, conversion[1] / 160934.4 },
				{ conversion[2], conversion[2] / 100, conversion[2] / 2.54, conversion[2] / 30.48,
						conversion[2] / 91.44, conversion[2] / 160934.4 },
				{ conversion[3], conversion[3] / 100, conversion[3] / 2.54, conversion[3] / 30.48,
						conversion[3] / 91.44, conversion[3] / 160934.4 },
				{ conversion[4], conversion[4] / 100, conversion[4] / 2.54, conversion[4] / 30.48,
						conversion[4] / 91.44, conversion[4] / 160934.4 },
				{ conversion[5], conversion[5] / 100, conversion[5] / 2.54, conversion[5] / 30.48,
						conversion[5] / 91.44, conversion[5] / 160934.4 } };
		for (int i = 0; i < str.length; i++) {
			System.out.print("         " + str[i] + "     ");
		}
		System.out.println();
		for (int i = 0; i < table.length; i++) {
			System.out.printf("%s  ", str[i]);
			for (int j = 0; j < table[i].length; j++) {
				System.out.printf("%.12f   ", table[i][j]);
			}
			System.out.println();
		}
	}
}
