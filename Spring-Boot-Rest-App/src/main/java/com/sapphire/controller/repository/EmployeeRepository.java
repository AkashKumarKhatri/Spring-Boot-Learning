package com.sapphire.controller.repository;

import org.springframework.data.repository.CrudRepository;

import com.sapphire.controller.model.EmployeeModel;

public interface EmployeeRepository extends CrudRepository<EmployeeModel, Long> {
	
}
