package com.review1.project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.review1.project.Model.CafeModel;



public interface CafeRepository extends JpaRepository<CafeModel, Integer> {

}
