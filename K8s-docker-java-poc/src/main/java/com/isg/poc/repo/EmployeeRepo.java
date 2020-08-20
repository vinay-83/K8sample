package com.isg.poc.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.isg.poc.model.EmployeeModel;

@Repository
public interface EmployeeRepo extends JpaRepository<EmployeeModel, Integer>{

}
