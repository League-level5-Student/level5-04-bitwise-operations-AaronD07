package _01_Bit_Shifting;

public class BitShifter {
	public static void main(String[] args) {
		// 1. Jot down the value of num in binary.
		int num = 4;
		String numb = convertDecimalToBinary(num);
		int numShifted = num << 1;
		
		// 2. Print the value of numShifted, and convert that value to binary
		System.out.println(numShifted);
		String num2 = convertDecimalToBinary(numShifted);
		// 3. Compare the two binary values. Can you figure out what the << operator is for?
		
		// 4. Try shifting num 3 places.
		int numShifted2 = num << 3;
		// FYI: Binary values can be shifted to the right as well using the >> operator.	
	}
	 public static String convertDecimalToBinary(int num) {
	        String binaryStr = "";
	    
	        do {
	            // 1. Logical right shift by 1
	            int quotient = num >>> 1;
	        
	            // 2. Check remainder and add '1' or '0'
	            if( num % 2 != 0 ){
	                binaryStr = '1' + binaryStr;
	            } else {
	                binaryStr = '0' + binaryStr;
	            }
	            
	            num = quotient;
	            
	        // 3. Repeat until number is 0
	        } while( num != 0 );
	        
	        return binaryStr;
	    }
}
