package com.example.service;

import org.springframework.stereotype.Service;

import com.example.entity.Palindrome;

@Service
public interface ClientService {

	void addClient(Palindrome palindrome);
}
