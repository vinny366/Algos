package arrays;

import java.util.Collections;
import java.util.PriorityQueue;

public class ReplaceLargestNum {

	public static void main(String[] args) {
		int num = 623315;
		//int new_num = findLargest(num);
		int new_num1 = findLargest1(num);
		System.out.println(new_num1);
	}

	private static int findLargest1(int num) {
		
		String strNum = String.valueOf(num);
//		for(int i=0; i<strNum.length()-1; i++){
//		if(strNum.length()>=2){
//			
//			int value1 = Integer.parseInt(strNum.substring(0,1));
//			int value2 = Integer.parseInt(strNum.substring(1,2));
//			
//			int avg = (value1+value2)/2;
//			
//			StringBuilder = 
//		}
		
	
		PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
			
		for(int i=0; i<strNum.length()-1; i++){
			String newString = i == 0 ? "" : strNum.substring(0,i);
			System.out.println("Bhanu");
				int value =(Integer.parseInt(strNum.substring(i,i+1))+ Integer.parseInt(strNum.substring(i+1,i+2)));
				value = (value%2==0)? value/2 :(value+1)/2;
				newString += value + strNum.substring(i+2, strNum.length());
		
			queue.add(Integer.valueOf(newString));
		}
		System.out.println(queue);
		return queue.poll();
	}

	private static int findLargest(int num) {
		int prevDigit = num%10;
		int nextDigit = 0;
		
		int remainingNum = num/10;
		int multiplier = 1;
		int prevAllDigits = 0;
		int curReplacedNum = prevDigit;
		while(remainingNum > 0)  {
			nextDigit = remainingNum%10;
			int biggerDigit = nextDigit;
			if (prevDigit > nextDigit)
				biggerDigit = prevDigit;
			int replacedNum1 = biggerDigit*multiplier + prevAllDigits;
			
			int replacedNum2 = curReplacedNum + (nextDigit*multiplier);
			
			curReplacedNum = replacedNum2;
			if (replacedNum1 < replacedNum2) {
				curReplacedNum = replacedNum1;
			}
			prevAllDigits = prevAllDigits + prevDigit*multiplier;
			prevDigit = nextDigit;
			multiplier *= 10;
			remainingNum = remainingNum / 10;
			
		}
		return curReplacedNum;
	}

}
