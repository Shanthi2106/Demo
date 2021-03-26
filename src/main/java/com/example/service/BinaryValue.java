package com.example.service;

public class BinaryValue {
	
	public static void main(String[] args) {
		
		getBinaryValue();
	}
	
	public static Integer getBinaryValue() {
		StringBuilder binaryNumber = new StringBuilder();
		
		String result = "";
		Integer quotient = 47;
		
		while(quotient > 0) {
			
		int remainder = quotient % 2 ;
		binaryNumber.append(remainder);
		quotient /= 2;
		}
		
		binaryNumber = binaryNumber.reverse();
		result = binaryNumber.toString();
		
		if(binaryNumber.length() < 8) {
			result = "00"+ result;
		}
		
		System.out.println("Binary Representation of the entered number "+result);
		
		String reverse = new StringBuffer(result).reverse().toString();
		return convertBinaryToDecimal(reverse);
		
		
	}
	
	public static int convertBinaryToDecimal(String str) {
		int result = 0;
		for(int i=0 ; i < str.length(); i++) {
			int value = Character.getNumericValue(str.charAt(i));
			result = result * 2 + value;
		}
		return result;
	}

}
