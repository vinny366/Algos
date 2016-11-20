package arrays;

import javax.sound.midi.Synthesizer;

/**
 * 
 * @author Vinny366
 *	Given two character Arrays find the sum of these both arrays
 *  arr 1= {1,2,3}
 *  arr2 = {0,9,9} 
 *   = 123 + 99 = 222;
 *  resultant charArray = {2,2,2}
 *  
 *  
 *  
 *  
 */

/*
 * // This is the text editor interface. 
// Anything you type or change here will be seen by the other person in real time.

/*
two strings as input, one string as output/result
eg. "123"  + "45"  = "168"
      "123"  + "9"  = "132"


public class sum{
    public static void main(String[] args){
        String s1 = "123";
        String s2 = "45";
        System.out.println("s1="+s1);
        System.out.println("s2="+s2);
        String res = calculateSum(s1,s2);
        System.out.println(s1+"+"+s2+"="+res);
    }
    
    public static String calculateSum(String s1, String s2){
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        
        int carry =0;
        int l1 = c1.length-1;
        int l2 = c2.length-1;
        int l3 =  Math.max(l1,l2) + 2;
        int finallen = l3;
        char[] res = new char[l3];
        
        while(l1 >=0 && l2>=0){
            int p = (c1[l1] - '0') + (c2[l2] - '0') + carry;
            System.out.println((char)(p%10 + 48));
            res[l3-1] = (char)(p%10 + 48);
            if(p>10){
                carry = 1;
            }else{
                carry = 0;
            }
            l1--;
            l2--;
            l3--;
        } // while
        System.out.println(l1 + "len1");
        System.out.println(l2 + "len2");
        if(l1 >= 0){
            System.out.println("Max String");
            while(l1>=0){
                res[l3-1] = (char)( c1[l1] - '0' + 48);
                l3--;
                l1--;
            }
        }
        
         if(l2 >= 0){
            while(l2>=0){
                res[l3-1] = (char)( c1[l2] - '0' + 48);;
                l3--;
                l1--;
            }
        }
       
        StringBuffer sb = new StringBuffer();
        if(carry == 1){
            System.out.println("carry = 1");
            res[0] = (char)(carry+48);
            for(char ch : res){
               
                sb.append(ch);
            }
            
        }else{
            //strip
            System.out.println("carry = 0");
            char[] finalarr = new char[finallen];
            for(int i=1;i<finalarr.length;i++){
                System.out.println(res[i]);
                sb.append(res[i]);
                
            }
        }
        System.out.println(sb);
        return sb.toString();
    }
    
    
}
 */
public class CharacterArraySum {

	public static void main(String[] args) {
		char[] c1 = {'1','9'};
		char[] c2 = {'5','9','5'};
	
		calSum(c1,c2);
		String s1 = "123";
		StringBuffer sb= new StringBuffer();
		
	}

	private static void calSum(char[] c1, char[] c2) {
		int carry = 0;
		
		int l1 = c1.length-1;
		int l2 = c2.length-1; // 219   //245
		int l3 = Math.max(l1, l2) + 2;
	
		char[] res = new char[l3];
		while(l1 >=0 && l2 >=0){
			
			int p = (c1[l1] - '0') + (c2[l2] - '0') + carry;
			res[l3-1] = (char) (p%10 + 48);
			if(p>10){
				carry = 1;
			}else{
				carry = 0;
			}
			l1--;
			l2--;
			l3--;
			
		}
		if(carry == 1){
			res[0] =  (char) (carry +48);
		}
		for(int i1=0;i1<res.length;i1++){
			System.out.println(res[i1]);
		}
	}

}
