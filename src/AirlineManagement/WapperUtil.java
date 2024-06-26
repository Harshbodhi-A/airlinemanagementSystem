package AirlineManagement;

public class WapperUtil {
	
	public static Integer findMax(Integer[] number) {
		if(number == null || number.length == 0) {
			return null;
		}
		int max = number[0];
		for(int num : number) {
			if(num > max) {
				max = num;
			}
		}
		return max;
	}

	public static Double calculateAverage(Double[] numbers) {
		if(numbers == null || numbers.length == 0) {
			return null;
		}
		double sum = 0;
		for(double num : numbers) {
			sum = sum + num;
		}
		return sum/numbers.length;
	}
	
	public static Boolean[] convertToBooleanArray(String binaryString) {
		Boolean[] booleanArray = new Boolean[binaryString.length()];
		for(int i = 0; i < binaryString.length(); i++) {
			booleanArray[i] = binaryString.charAt(i) == '1'
;		}
		return booleanArray;
	}
	
	public static String convertToBinaryString(Boolean[] booleanArray) {
		StringBuilder binaryString = new StringBuilder();
		for(Boolean b : booleanArray) {
			binaryString.append(b ? '1' : '0');
		}
		return binaryString.toString();
	}
}
