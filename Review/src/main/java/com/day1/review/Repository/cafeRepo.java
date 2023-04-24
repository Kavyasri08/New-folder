package com.day1.review.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.day1.review.databaseex.cafeideas;
@Repository
public interface cafeRepo extends JpaRepository<cafeideas, Integer> {

}
