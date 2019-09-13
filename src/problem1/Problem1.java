package problem1;
/**
 * Class created to solve the Multiples of 3 and 5 problem on
 * Projecteuler.net
 * 
 * Description Below:
 * If we list all the natural numbers below 10 
 * that are multiples of 3 or 5, we get 3, 5, 6 and 9. 
 * The sum of these multiples is 23.
 * Find the sum of all the multiples of 3 or 5 below 1000.
 * 
 * @author Chandler Broadwater
 *
 */
public class Problem1 {

	public static void main(String[] args) {
		int max = 1000;
		System.out.println("The sum of the numbers underneath " + max + " that are"
				+ " multiples of 3 or 5 are: " + sum(max));
	}
	/**
	 * A method to calculate the numbers that are multiples of
	 * 3 or 5 and to calculate the sum of those numbers under
	 * a given max value
	 * @param max - The max value that the numbers calculated go to
	 * @return sum - The sum of the numbers calculated that 
	 * are a multiple of 3 or 5
	 */
	private static int sum(int max) {
		if(max==0) return 0;
		int sum = 0;
		for(int i=0; i<max; i++) {
			if(i%3==0||i%5==0) {
				sum = sum + i;
			}
		}
		return sum;	
	}

}
