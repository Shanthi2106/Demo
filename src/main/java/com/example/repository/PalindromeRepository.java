package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.Palindrome;

@Repository
public interface PalindromeRepository extends JpaRepository<Palindrome, Long>{

}
