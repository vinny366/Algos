package others;

public class A {

	public static void main(String[] args) {
		String s = getLexicographicallyGreaterString("hcdk");
		System.out.println(s);

	}
	
	public static String getLexicographicallyGreaterString(String s) {
        char[] arr_word = s.toCharArray();
        int n = arr_word.length;
        int i, j;
        int index = -1, index2 = 0;
        char t;
        StringBuilder output = new StringBuilder();
        for (i = n - 2; i >= 0; i--) {
            if (arr_word[i] < arr_word[i + 1]) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            return "no answer";
        } else {
            for (j = n - 1; j > index; j--) {
                if (arr_word[j] > arr_word[index]) {
                    index2 = j;
                    break;
                }
            }
            t = arr_word[index];
            arr_word[index] = arr_word[index2];
            arr_word[index2] = t;
            for (i = 0; i <= index; i++) {
                output.append(arr_word[i]);
            }
            StringBuilder sb = new StringBuilder();
            for (i = index + 1; i < n; i++) {
                sb.append(arr_word[i]);
            }
            output.append(sb.reverse().toString());
        }
        return output.toString();
    }

}
