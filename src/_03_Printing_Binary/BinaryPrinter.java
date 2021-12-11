package _03_Printing_Binary;

public class BinaryPrinter {
	/*
	 * Complete the methods below so they print the passed in parameter in binary.
	 * Do not use the Integer.toBinaryString method!
	 * Use the main method to test your methods.
	 */

	
	public static void printByteBinary(byte b) {
		// We first want to print the bit in the one's place
		// Shift b seven bits to the right
		// Use the & operator to "mask" the bit in the one's place
		int shifted = b >> 7;
		
		int hello = shifted & 1;
		System.out.print(hello);
int shifted1 = b >> 7;
		
		int hello7 = shifted1 & 1;
		System.out.print(hello7);
int shifted2 = b >> 7;
		
		int hello6 = shifted2 & 1;
		System.out.print(hello6);
int shifted3 = b >> 7;
		
		int hello5 = shifted3 & 1;
		System.out.print(hello5);
int shifted4 = b >> 7;
		
		int hello4 = shifted4 & 1;
		System.out.print(hello4);
int shifted5 = b >> 7;
		
		int hello3 = shifted5 & 1;
		System.out.print(hello3);
int shifted6 = b >> 7;
		
		int hello2 = shifted6 & 1;
		System.out.print(hello2);
int shifted7 = b >> 7;
		
		int hello1 = shifted7 & 1;
		System.out.print(hello1);
		// This can be done by "anding" (&) it with the value of 1
		
		// Print the result using System.out.print (NOT System.out.println)
		
		//Use this method to print the remaining 7 bits of b
	}
	
	public void printShortBinary(short s) {
		// Create 2 byte variables
		byte one;
		byte two;
		
		// Use bit shifting and masking (&) to save the first
		// 8 bits of s in one byte, and the second 8 bits of
		// s in the other byte
		
		// Call printByteBinary twice using the two bytes
		// Make sure they are in the correct order
	}
	
	public void printIntBinary(int i) {
		// Create 2 short variables
		short one;
		short two;
		
		// Use bit shifting and masking (&) to save the first
		// 16 bits of i in one short, and the second 16 bits of
		// i in the other short
		
		// Call printShortBinary twice using the two short variables
		// Make sure they are in the correct order
	}
	
	public void printLongBinary(long l) {
		// Use the same method as before to complete this method
	}
	
	public static void main(String[] args) {
		// Test your methods here
		printByteBinary((byte) 10110101);
	}
}
