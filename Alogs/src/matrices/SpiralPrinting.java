package matrices;

public class SpiralPrinting {

	public static void main(String[] args) {
		int[][] mat = { { 1, 2, 3,4}, {5,6,7,8}, { 9,10,11,12 },{13,14,15,16},{17,18,19,20} };
		int rows = mat.length;
		int cols = mat[0].length;
		printMatrixSpirally(mat, rows, cols);
//		System.out.println(mat[0][1]);
	}

	/**
	 * 
	 * @param mat
	 * @param m
	 *            -- rows
	 * @param n
	 *            -- cols
	 * 
	 */
	private static void printMatrixSpirally(int[][] a, int m, int n) {
		int k = 0; // start row
		int l = 0; // start col
		int i;

		while (k < m && l < n)
	    {
	        /* Print the first row from the remaining rows */
	        for (i = l; i < n; ++i)
	        {
	          System.out.print(a[k][i] + ",");  
	        }
	        k++;
	 
	        /* Print the last column from the remaining columns */
	        for (i = k; i < m; ++i)
	        {
	        	 System.out.print(a[i][n-1] + ",");  
	        }
	        n--;
	 
	        /* Print the last row from the remaining rows */
	        
	            for (i = n-1; i >= l; --i)
	            {
	            	 System.out.print(a[m-1][i] + ",");  
	            }
	            m--;
	        
	 
	        /* Print the first column from the remaining columns */
	        
	            for (i = m-1; i >= k; --i)
	            {
	            	System.out.print(a[i][l]+ ",");  
	            }
	            l++;    
	                
	    }

	}

}
