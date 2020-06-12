package com.cognizant.SpringEmployee.dao;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Repository;

import com.cognizant.SpringEmployee.model.Employee;
import com.cognizant.SpringEmployee.service.EmployeeService;

@Repository
public class EmployeeDao {

	public static List<Employee> EMPLOYEE_LIST=new ArrayList<>();

	private static final Logger LOGGER=LoggerFactory.getLogger(EmployeeService.class);
	@SuppressWarnings("unchecked")
	public EmployeeDao() {
		LOGGER.debug("EmployeeDao called");
		@SuppressWarnings("resource")
		ApplicationContext ctx=new ClassPathXmlApplicationContext("employee.xml");
		EMPLOYEE_LIST=(ArrayList<Employee>) ctx.getBean("employeeList");
	}
	public List<Employee> getAllEmployee(){
		return EMPLOYEE_LIST;
		
	}
	
}
