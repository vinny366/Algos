package google;

public class Zappos {

	public static void main(String[] args) {
		String number = "234987";
		int k =2;
		
		String small_number = number;
	    while(k > 0 && small_number.length() > 0) {
	        int firstDecreasingDigit = getDecreasing(small_number);
	        if(firstDecreasingDigit >= 0) {
	            small_number = removeDigit(small_number, firstDecreasingDigit);
	        }
	        else {
	            small_number = removeDigit(small_number, small_number.length() - 1);
	        }

	        --k;
	    }

	    System.out.print(small_number);
	}
	private static int getDecreasing(String number) {
	    for(int i = 0; i < number.length() - 1; ++i) {
	        int curDigit = number.charAt(i) - '0';
	        int nextDigit = number.charAt(i + 1) - '0';
	        if(curDigit > nextDigit) {
	            return i;
	        }
	    }

	    return -1;
	}

	private static String removeDigit(String number, int index) {
	    String result = "";
	    if(index > 0) {
	        result = number.substring(0, index);
	    }
	    if(index < number.length() - 1) {
	        result += number.substring(index + 1);
	    }

	    return result;
	}
	
	

}
