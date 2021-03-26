package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.example.entity.Palindrome;
import com.example.service.ClientService;
import com.example.service.PalindromeService;

@RestController
@RequestMapping("/palindrome")
public class PalindromeController {

	//PalindromeService palindromeService;

	private ClientService clientService;

	@Autowired
	public void setClientService(ClientService clientService) {
		this.clientService = clientService;
	}

	/*
	 * @Autowired PalindromeRepository palindromeRepository;
	 */
	/*
	 * @PostMapping(value = "/longest") public String
	 * storeLongestPalindrome(@RequestBody Input input) {
	 * 
	 * String result = palindromeService.longestPalindrome(input.getInput());
	 * 
	 * Palindrome p = new Palindrome(); p.setLongestPalindrome(result);
	 * 
	 * palindromeRepository.save(p); return result; }
	 */
	
	 @RequestMapping(value = "registration/add", method = RequestMethod.POST)
	    public String addUser(@ModelAttribute Palindrome palindrome){
	        this.clientService.addClient(palindrome);
	    return "home";
	    }

}
