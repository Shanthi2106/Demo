package com.example.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PALINDROME")
public class Palindrome implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="LONGESTPALINDROME")
	private String longestPalindrome;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getLongestPalindrome() {
		return longestPalindrome;
	}

	public void setLongestPalindrome(String longestPalindrome) {
		this.longestPalindrome = longestPalindrome;
	}
	
	

}
