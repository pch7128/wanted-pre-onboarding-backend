package com.pch7128.jieun.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pch7128.jieun.dto.Company;

@Repository
public interface CmRepository extends JpaRepository<Company, Integer>{

	
}
