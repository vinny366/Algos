package google;

public class EggDrop {

	public static void main(String[] args) {
		int floors = 5;
		int eggs = 2;
		System.out.println(find(eggs, floors));
		System.out.println(dpfind(eggs, floors));
	}

	private static int dpfind(int eggs, int floors) {
		int[][] m = new int[eggs + 1][floors + 1];
		for (int i = 0; i <= floors; i++) {

			m[1][i] = i;
		}
		int c = 0;
		for (int e = 2; e <= eggs; e++) {
			for (int f = 1; f <= floors; f++) {
				m[e][f] = Integer.MAX_VALUE;
				for (int k = 1; k <= f; k++) {
					c = 1 + Math.max(m[e - 1][k - 1], m[e][f - k]);
					if (c < m[e][k])
						m[e][k] = c;
				}
			}
		}
		
		for(int i=0;i<=eggs;i++){
			for(int k=0;k<=floors;k++){
				System.out.print(m[eggs][floors] + " ");
			}
			System.out.println();
		}

		return m[eggs][floors];
	}

	private static int find(int eggs, int floors) {
		if (eggs == 1)
			return floors;
		if (floors == 0)
			return 0;
		int min = 1000;
		for (int i = 1; i <= floors; i++) {
			int al = 1 + Math.max(find(eggs - 1, i - 1), find(eggs, floors - i));
			if (al < min)
				min = al;
		}
		return min;
	}
}