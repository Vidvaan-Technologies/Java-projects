package com.vidvaan.spring.boot.sprintbootapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vidvaan.spring.boot.sprintbootapp.dao.EmployeeDAO;
import com.vidvaan.spring.boot.sprintbootapp.domain.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDAO employeeDAO;

	public Employee findById(int eno) {
		return employeeDAO.findById(eno);
	}

	@Override
	public void deleteById(int eno) {
		employeeDAO.deleteById(eno);

	}

	@Override
	public Employee insert(Employee employee) {
		return employeeDAO.insert(employee);
	}
}
