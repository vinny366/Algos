package matrices;
/**
 * 
 * @author Vinny366
 *  have 4 pointers - toprow as t;  bottom row as b; first col as f; last col as l  and direction = 0
 *  
 *  dir = 0 -->    
 *  dir = 1 pai nunchi kindaki
 *  dir = 2  <--
 *  dir = 3  kinda nunchi paiki 
 *  
 *    This has to be done while (l<=r && t<=b)
 *  
 */
public class SprialMatrix {

	public static void main(String[] args) {
		int[][] mat = { { 1, 2, 3,4}, {5,6,7,8}, { 9,10,11,12 },{13,14,15,16},{17,18,19,20} };
		int rows = mat.length;
		int cols = mat[0].length;
		printMatrixSpirally(mat, rows, cols);

	}

	private static void printMatrixSpirally(int[][] mat, int rows, int cols) {
		Matrix_Zeors.printMatrix(mat);
		
		int left = 0;
		int top = 0;
		int right = cols-1;
		int bottom = rows-1;
		int dir =0;
		while(left<=right && top<= bottom){
			if(dir ==0){
				for(int j=left; j<=right; j++){
					System.out.print(mat[top][j] + ",");
				}
				top++;
				dir =1;
			}
			else if(dir ==1){
				for(int i=top;i<=bottom;i++){
					System.out.print(mat[i][right] + ",");
				}
				right--;
				dir = 2;
			}
			else if(dir == 2){
				for(int j=right; j>=left; j--){
					System.out.print(mat[bottom][j] + ",");
				}
				bottom--;
				dir =3;
			}else if(dir == 3){
				for(int i=bottom; i>=top; i--){
					System.out.print(mat[i][left] + ",");
				}
				left++;
				dir =0;
			}
		}
	}

}




