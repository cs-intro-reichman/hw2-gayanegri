// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    int n = Integer.parseInt(args[0]);
		char mode = args[1].charAt(0);
		if (mode == 'v') {
			System.out.println("1 4 2 1 (4)");
		}
		int seed = 2;
		while (seed <= n) {
			String row = ("" + seed);
			int count = 1;
			int y = seed;
			while (y > 1) {
				if (y % 2 == 0) {
					y = (y / 2);
				} else {
					y = (y * 3 + 1);
				}
				row = (row + " " + y);
				count ++ ;
			}
			if (mode == 'v' && y == 1 ) {
				System.out.println(row + " (" + count + ")");
			}
			seed++ ;
		}
		if (seed == n + 1){
		    System.out.println("Every one of the first " + n + " hailstone sequences reached 1.");
		} // Replace this comment with your code
	}
}
