package java_20_06_09;

public class ConversionTable {
	public static void main(String[] args) {
		int n = 1;
		String[] str = { "CM", "M", "Inch", "Feet", "Yard", "Mile" };
		double[] Criteria = { n, 100 * n, 2.54 * n, 30.48 * n, 91.44 * n, 160934.4 * n };	//기준배열
		for (int i = 0; i < str.length; i++) {
			System.out.print("         "+str[i]+"     ");
		}
		System.out.println();
		for (int i = 0; i < Criteria.length; i++) {
			double[] Conversion = { Criteria[i], Criteria[i] / 100, Criteria[i] / 2.54, Criteria[i] / 30.48,	//환산배열
					Criteria[i] / 91.44, Criteria[i] / 160934.4 };
			System.out.printf("%s  ", str[i]);
			for (int j = 0; j < Conversion.length; j++) {
				System.out.printf("%.12f   ", Conversion[j]);	//소수점12번째자리까지출력
			}
			System.out.println();
		}
	} 
}
