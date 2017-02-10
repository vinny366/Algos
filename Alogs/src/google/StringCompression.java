package google;

public class StringCompression {
	public static void main(String[] args){
		String input = "aabbbb";
		String input2 = "abc";
		compress(input,input.length());
		compress(input2,input2.length());
	}
	
	public static void compress(String s,int len){
		StringBuffer sb = new StringBuffer();
		int counter =0;
		int totalLen = 0;
		for(int i =0; i<len;i++){
			
			if(i==len-1 || s.charAt(i) != s.charAt(i+1)){
				sb.append(s.charAt(i));
				sb.append(++counter);
				counter = 0;
			}else{
				++counter;
				
			}
		}
		System.out.println("total" + totalLen + "sss" +len);
		System.out.println((len<sb.length())?s:sb.toString());
	}
}
