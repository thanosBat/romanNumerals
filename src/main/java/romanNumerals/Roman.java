package romanNumerals;

public class Roman {
	
	static int[] ARABIC_NUMERALS = { 1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000 };
	static String[] ROMAN_NUMERALS = { "I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M" };
	
	
	public boolean checkParam(int number) {
		
		if (number < 1 || number > 3999 ) {
			return false;
		}
		
		return true;
	}
	
	
	public String generate(int number) throws Exception {
		
		String roman = "";
		int tmp = number;
		
		if (!checkParam(number)) {
			throw new Exception("Number should be 0 < number < 4000.");
		}
		
		int size = ARABIC_NUMERALS.length;
		for (int i=size-1; i>=0; i--) {
			while (tmp >= ARABIC_NUMERALS[i]) {
				roman = roman + ROMAN_NUMERALS[i];
				tmp = tmp - ARABIC_NUMERALS[i];
			}
		}
		
		return roman;
	}
	
}
