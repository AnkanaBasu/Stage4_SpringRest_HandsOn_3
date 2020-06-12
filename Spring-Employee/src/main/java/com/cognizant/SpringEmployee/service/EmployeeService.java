package com.cognizant.SpringEmployee.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.SpringEmployee.dao.EmployeeDao;
import com.cognizant.SpringEmployee.model.Employee;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;
	private static final Logger LOGGER=LoggerFactory.getLogger(EmployeeService.class);
	public EmployeeService() {
		LOGGER.debug("Employee Rest Service called");
	}
	public List<Employee> getAllEmployee(){
		return employeeDao.getAllEmployee();
	}
	
}
