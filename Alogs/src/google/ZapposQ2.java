package google;

public class ZapposQ2 {

	public static void main(String[] args) {
		int x1 = 3;
		int y1 = 1;
		int x2 = 7;
		int y2 = 1;
		int x3 = 5;
		int y3 = 5;
		int px = 5;
		int py = 2;
		int bx = 6;
		int by =3;
		
		bermudaTriangle(x1,y1,x2,y2,x3,y3,px,py,bx,by);
		
	}

	private static void bermudaTriangle(int x1, int y1, int x2, int y2, int x3, int y3, int px, int py, int bx,
			int by) {
		boolean isTriangle = checkTriangle(x1,y1,x2,y2,x3,y3);
		boolean isPlaneInside = checkIsInside(x1,y1,x2,y2,x3,y3,px,py);
		boolean isBoatInside = checkIsInside(x1,y1,x2,y2,x3,y3,bx,by);
		
		
		
		
	}

	private static boolean checkIsInside(int x1, int y1, int x2, int y2, int x3, int y3, int poix, int poiy) {
		double areaTriangle = calArea(x1,x2,x3,y1,y2,y3);
		double a1 = calArea(x1,y1,poix,poiy,x2,y2);
		double a2 = calArea(x1,y1,poix,poiy,x3,y3);
		double a3 = calArea(x3,y3,poix,poiy,x2,y2);
		
		return (areaTriangle == (a1+a2+a3)) ?  true: false; 
		
	}

	private static double calArea(int x1, int x2, int x3, int y1, int y2, int y3) {
		
		return (x1*(y2-y3) + x2*(y3-y1)+ x3*(y1-y2))/2.0;
	}

	private static boolean checkTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
		
		double s1 = checkSlope(x1,y1,x2,y2);
		double s2 = checkSlope(x1,y1,x3,y3);
		double s3 = checkSlope(x3,y3,x2,y2);
		return((s1 == s2) || (s1==s3) || (s2==s3))?false:true;
		// TODO Auto-generated method stub
		
	}

	private static double checkSlope(int x1, int y1, int x2, int y2) {
		return ((y2-y1)/(x2-x1));
		
	}

}
