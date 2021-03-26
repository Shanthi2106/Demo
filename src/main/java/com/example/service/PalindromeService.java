package com.example.service;

import org.springframework.stereotype.Service;

@Service
public class PalindromeService {

	String printSubStr(String str, int low, int high) {
		String result = "";
		for (int i = low; i <= high; i++) {
			result = result + String.valueOf(str.charAt(i));
		}
		return result;
	}

	public String longestPalindrome(String str) {
		int maxLength = 1, start = 0;
		for (int i = 0; i < str.length(); i++) {
			for (int j = i; j < str.length(); j++) {
				int flag = 1;
				
				for (int k = 0; k < (j - i + 1) / 2; k++)
					if (str.charAt(i + k) != str.charAt(j - k))
						flag = 0;
				
				if (flag != 0 && (j - i + 1) > maxLength) {
					start = i;
					maxLength = j - i + 1;
				}
			}

		}
		return printSubStr(str, start, maxLength - 1);
	}
}
