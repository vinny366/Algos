//package others;
//
//public class NextPermutation {
//	/**
//	 * 4321 --- > no bigger value (last nundi ascending)
//	 * d1 = 1st element which is in descending from last
//	 * @param args
//	 */
//
//	public static void main(String[] args) {
//		int d1 = 0;
//		int min =0;
//		int d1Index = 0;
//		int minIndex;
//		String number ="32841";
//		for(int i = number.length()-1; i > 0 ;i--){
//			if(Character.getNumericValue(number.charAt(i)) > Character.getNumericValue(number.charAt(i-1))){
//				 d1 = Character.getNumericValue(number.charAt(i-1));
//				 d1Index = i-1;
//				 break;
//			}
//		} 
//		System.out.println( "index "+ d1Index);
//		min = number.charAt(d1Index+1);
//		for (int h=d1Index+1; h<number.length()-1; h++){			 
//			if(Character.getNumericValue(number.charAt(h)) <= min){
//				min = Character.getNumericValue(number.charAt(h));
//				minIndex = h;
//			}
//		}
//		System.out.println(d1);
//		System.out.println(min);
//		
//		int temp = number.charAt(minIndex);
////		number[minIndex] = 
//				
//	}
//
//}
