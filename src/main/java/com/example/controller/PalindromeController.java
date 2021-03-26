package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Palindrome;
import com.example.repository.PalindromeRepository;
import com.example.request.Input;
import com.example.service.PalindromeService;

@RestController
@RequestMapping("/palindrome")
public class PalindromeController {

	@Autowired
	PalindromeService palindromeService;

	@Autowired
	PalindromeRepository palindromeRepository;

	@PostMapping(value = "/longest")
	public String storeLongestPalindrome(@RequestBody Input input) {

		String result = palindromeService.longestPalindrome(input.getInput());

		Palindrome p = new Palindrome();
		p.setId(Long.parseLong(input.getId()));
		p.setLongestPalindrome(result);

		palindromeRepository.save(p);
		return result;
	}

}
