package com.day1.review.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.day1.review.databaseex.StudentMod;

public interface StudentRep extends JpaRepository<StudentMod, Integer> {

}
