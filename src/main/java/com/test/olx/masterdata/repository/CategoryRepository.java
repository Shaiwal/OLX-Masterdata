package com.test.olx.masterdata.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.olx.masterdata.entity.CategoryEntity;

@Repository
public interface CategoryRepository extends JpaRepository <CategoryEntity, Integer>{

}


