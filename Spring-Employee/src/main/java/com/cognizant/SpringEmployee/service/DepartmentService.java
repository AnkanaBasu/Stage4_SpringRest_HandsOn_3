package com.cognizant.SpringEmployee.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.SpringEmployee.dao.DepartmnetDao;
import com.cognizant.SpringEmployee.model.Department;

@Service
public class DepartmentService {

	@Autowired
	private DepartmnetDao departmentDao;
	private static final Logger LOGGER = LoggerFactory.getLogger(DepartmentService.class);
	public DepartmentService() {
		LOGGER.debug("Department Rest Service Called");
	}

	public List<Department> getallEmployee() {
		return departmentDao.getallEmployee();
	}
}
