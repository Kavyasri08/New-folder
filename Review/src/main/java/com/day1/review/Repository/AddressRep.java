package com.day1.review.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.day1.review.databaseex.StudentAdd;

public interface AddressRep extends JpaRepository<StudentAdd, Integer> {

}
