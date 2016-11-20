package matrices;

/**
 * 
 * @author Vinny366 If a Matrix has Zero than change its row and column to 0
 * 
 * // iterate to the 1st column and set col0 = 0 if anyelement in col is 0;
 * // Iterate to all the elements of the matrix except 1st col and set   [ that is from j =1 ]
				// corrosponding row and col to 0 
 * 	// Iterate matrix from last(n*n) to 1nd col; dont iterate to 1st col set 0 if coors col & row  is 0
 * // Finally set col1 values to 0 if col0 = 0   
 */
public class Matrix_Zeors {

	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3, 0 }, { 0, 2, 3, 5 }, { 6, 7, 8, 9 } };
		changeZeros(matrix);
		printMatrix(matrix);
	}

	private static void changeZeros(int[][] matrix) {
		int rows = matrix.length;
		int cols = matrix[0].length;
		int col0 = 1;
		
		for(int i=0;i<rows;i++){
			if(matrix[i][0] == 0) col0 = 0; // iterate to the 1st column and set col0 = 0 if anyelement in col is 0;
			for(int j=1;j<cols;j++){   // Iterate to all the elements of the matrix except 1st col and set 
				// corrosponding row and col to 0
				if(matrix[i][j] == 0 ){
					matrix[i][0] = 0;
					matrix[0][j] = 0;
				}
			}			
		}
		
		// Iterate matrix from last(n*n) to 1nd col; dont iterate to 1st col set 0 if coors col & row  is 0
		for(int i= rows-1;i>=0;i--){
			for(int j= cols-1;j>=1;j--){
				if(matrix[i][0]==0 || matrix[0][j] == 0){
					matrix[i][j] = 0;
				}
			}
		}
		// Finally set col1 values to 0 if col0 = 0
		if(col0==0){
			for(int i=0;i<rows;i++){
				matrix[i][0] = 0;
			}
		}
		
	}
	
	public static void printMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j] +"  , ");
			}
			System.out.println();
		}
	}

}
