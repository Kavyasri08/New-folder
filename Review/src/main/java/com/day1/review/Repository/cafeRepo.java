package com.day1.review.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.day1.review.databaseex.cafeideas;

public interface cafeRepo extends JpaRepository<cafeideas, Integer> {

}
