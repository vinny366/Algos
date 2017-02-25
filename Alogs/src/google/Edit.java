package google;

public class Edit {

	public static void main(String[] args) {
		String a ="hell";
		String b = "hello";
		int d =findEdit(a,b,4,5);
	System.out.println(find(a,b));
		System.out.println(d);
	}

	private static int find(String a, String b) {
		int g = a.length()+1;
		int y = b.length()+1;
		int[][] m = new int[g][y];
		
		for(int i=0;i<g;i++){
			m[i][0] = i;
		}
		for(int i=0;i<y;i++){
			m[0][i] = i;
		}
		
		for(int i=1;i<=a.length();i++){
			for(int j=1;j<=b.length();j++){
				if(a.charAt(i-1) == b.charAt(j-1)){
					m[i][j] = m[i-1][j-1];
				}else{
					m[i][j] = 1+min(m[i-1][j-1],m[i-1][j],m[i][j-1]);
				}
			}
		}
		for(int i=0;i<=a.length();i++){
			for(int j=0;j<=b.length();j++){
				System.out.print(m[i][j]+" ");
			}
			System.out.println();
		}
		
		return m[a.length()][b.length()];
	}

	private static int min(int i, int j, int k) {
		int h = Math.min(i, j);
		
		return Math.min(h, k);
	}

	public static int findEdit(String a, String b, int m, int n) {
		if(m==0)
			return m;
		if(n==0)
			return n;
		if(a.charAt(m-1) == b.charAt(n-1))
			return findEdit(a, b, m-1, n-1);
		
		int y =Math.min(findEdit(a,b,m-1,n), findEdit(a,b,m,n-1));
		return 1+Math.min(y,findEdit(a, b, m-1, n-1));
		
			
	}

}
