package com.isg.poc.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.isg.poc.model.EmployeeModel;
import com.isg.poc.repo.EmployeeRepo;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeRepo employeeRepo;

	@GetMapping("/getAll")
	public List<EmployeeModel> getAll() {
		return employeeRepo.findAll();
	}

	@GetMapping("/findById/{id}")
	public Optional<EmployeeModel> findById(@PathVariable Integer id) {
		return employeeRepo.findById(id);
	}

	@GetMapping("/addUser/{id}/{name}")
	public EmployeeModel addUser(@PathVariable Integer id, @PathVariable String name) {
		EmployeeModel user = new EmployeeModel();
		user.setId(id);
		user.setName(name);
		return employeeRepo.save(user);
	}

}
