package com.cognizant.SpringEmployee.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.SpringEmployee.model.Employee;
import com.cognizant.SpringEmployee.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	private static final Logger LOGGER=LoggerFactory.getLogger(EmployeeService.class);
	
	@GetMapping("/employees")
	public List<Employee> getAllEmployee(){
		LOGGER.debug("Start method getAllEmployee");
		LOGGER.debug("End method getAllEmployee");
		return employeeService.getAllEmployee();
		
		
	}
}
