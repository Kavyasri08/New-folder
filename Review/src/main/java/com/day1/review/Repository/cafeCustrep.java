package com.day1.review.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.day1.review.databaseex.cafeCust;


public interface cafeCustrep extends JpaRepository<cafeCust, Integer> {
	cafeCust findByusername(String username);

}
