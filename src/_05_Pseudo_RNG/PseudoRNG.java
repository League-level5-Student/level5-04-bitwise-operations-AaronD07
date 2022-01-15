package _05_Pseudo_RNG;

public class PseudoRNG {
	/*
	 * It is impossible for a computer to come up with a series of numbers that are
	 * truly random. They can, however, use mathematical algorithms to generate
	 * numbers that can seem random. These are called pseudo random numbers.
	 * 
	 */

	// 1. Create a member variable of type long called "seed"
	Long seed;

	// 2. Make a constructor that initializes the memeber variable
	public PseudoRNG(Long seed) {
		seed = new Long(null);
	}
	// 3. Complete the steps inside the xorShift method

	// 4. Complete the steps in the main method

	// 5. Write your own pseudo random generation method. You can use the xor
	// shift as a guide. Use the main method to test it.

	// This is called the xor shift. It is a very simple algorithm to generate
	// Pseudo random numbers.
	long xorShift(){
		//1. Create a local long called seed and set it equal to the member variable 
		//   We will only use the local variable for the rest of the method
		Long seed2 = seed;
		//2. Shift seed to the left 13 bits and save the result
		Long seed2Shifted = seed2 << 13;
		//3. xor seed by the result of step 1 and save that result
		seed2 = seed2^seed2Shifted;
		
		//4. Set seed equal to the result of step 2
	seed2=seed2Shifted;
		//5. Shift seed to the right 7 bits and save the result
		Long seedShifted = seed2 >> 7;
		//6. xor seed by the result of step 4 and save that result
				seed2 = seed2^seedShifted;
				
		//7. Set seed equal to the result of step 5
		seed2=seedShifted;
		//8. Shift seed to the left 17 bits and save the result
		 Long seedShifted3 = seed2 << 17;
		//9. xor seed by the result of step 7 and save that result
		 seed2 = seed2^seedShifted3;
		//10. Set seed equal to the result of step 8
		seed2 = seedShifted3;
		//11. change the line below to return seed
		return seed2;
		
		//For fun, see if you can rewrite the method using only 4 lines of code
	}

	public static void main(String[] args) {
Long seedling = new Long(null);
		// 1. Create a PseudoRNG object with any seed.
PseudoRNG obj = new PseudoRNG(seedling);
		// 2. Print the result of xorShift() 3 times and note the random numbers.
int one = (int) obj.xorShift();
System.out.println(one);
int two = (int) obj.xorShift();
System.out.println(two);
int three = (int) obj.xorShift();
System.out.println(three);
		// 3. Create a secon PSeudoRNG object with a different seed and print the result
		// of xorShift 3 times.

		// 4. Run the tests a second time and notice that 3 random numbers are the same
		// because the seed generates the same sequence of random numbers.

		// If you would like to set the seed with a number that is hard to predict, you
		// can use System.currentTimeMillis().

	}
}
