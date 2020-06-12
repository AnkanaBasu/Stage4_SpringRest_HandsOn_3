package com.cognizant.SpringEmployee.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.SpringEmployee.model.Department;
import com.cognizant.SpringEmployee.service.DepartmentService;
import com.cognizant.SpringEmployee.service.EmployeeService;

@RestController
public class DepartmentController {

	@Autowired
	private DepartmentService departmentService;
	private static final Logger LOGGER=LoggerFactory.getLogger(EmployeeService.class);
	@GetMapping("/departments")
	public List<Department> getallEmployee() {
		LOGGER.debug("Start method getAllDepartment");
		LOGGER.debug("End method getAllDepartment");
		return departmentService.getallEmployee();
	}
}
