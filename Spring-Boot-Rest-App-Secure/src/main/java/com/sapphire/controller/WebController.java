package com.sapphire.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sapphire.controller.model.EmployeeModel;
import com.sapphire.controller.repository.EmployeeRepository;

@RestController
public class WebController {
	
	@Autowired
	EmployeeRepository empRepo;
	
	@RequestMapping("/hello")
	public String sayHi() {
		return "Hi";
	}
	
	@RequestMapping("/all")
	public List<EmployeeModel> findAll() {
		return (List<EmployeeModel>) empRepo.findAll();
	}
}
