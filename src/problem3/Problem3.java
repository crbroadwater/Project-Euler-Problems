package problem3;

import java.util.ArrayList;

/**
 * This class answers the problem listed below:
 * 
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?
 * @author Chandler Broadwateer
 *
 */
public class Problem3 {

	public static void main(String[] args) {
		Long number = (long) 600851475143L;
		System.out.println(prime(number));
	}
	
	/**
	 * This method creates an ArrayList that returns the prime factors of a given number
	 * @param number - The number for which prime numbers are found
	 * @return prime - the array that contains the prime numbers
	 */
	private static ArrayList<Long> prime(long number) {
		ArrayList<Long> prime = new ArrayList<Long>();
		long copy = (long)number;
		for(int i = 2; i <= copy; i++) {
			if(copy % i == 0) {
				prime.add((long) i);
				copy /= i;
				i--;
				
			}
		}
		return prime;
	}
	
}
