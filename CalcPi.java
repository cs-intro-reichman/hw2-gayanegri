// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    int n = Integer.parseInt(args[0]);
		double down = 1.0;
		double sum = 0.0;
		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				sum = sum + (1 / down);
			} else {
				sum = sum - (1 / down);
			} 
			down = down + 2;
		} 	
		
		double piApproximated = (sum * 4);

		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated:     " + piApproximated);
			 // Replace this comment with your code
	}

}
