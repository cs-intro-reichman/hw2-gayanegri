// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    int n = Integer.parseInt(args[0]);
		int negative = (n / 2);
		int x = 3;
		double fneg = (-1.0 / x);
		for (int m = 1; m < negative; m++) {
		    x = (x + 4);
			fneg = fneg - (1.0 / x);	
		}

		int positive = ((n + 1) / 2);
		int y = 1;
		double fpos = (1.0 / y);
		for (int m = 1; m < positive; m++) {
		    y = (y + 4);
			fpos = fpos + (1.0 / y);	
		}
		double piApproximated = ((fpos + fneg) * 4);

		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated:     " + piApproximated);
			 // Replace this comment with your code
	}

}
