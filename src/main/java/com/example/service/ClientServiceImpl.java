package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.entity.Palindrome;
import com.example.repository.PalindromeRepository;

@Repository
public class ClientServiceImpl implements ClientService {

	private PalindromeRepository palindromeRepository;

	@Autowired
	public void setPalindromeRepository(PalindromeRepository palindromeRepository) {
		this.palindromeRepository = palindromeRepository;
	}

	@Override
	public void addClient(Palindrome palindrome) {
		palindromeRepository.save(palindrome);
	}

}
