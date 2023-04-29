package com.day1.review.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.day1.review.databaseex.cafeLogin;

public interface cafeLoginrepo extends JpaRepository<cafeLogin, Integer>
{
cafeLogin findByusrname(String usrname);
}

