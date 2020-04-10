package com.vidvaan.spring.boot.sprintbootapp.service;

import com.vidvaan.spring.boot.sprintbootapp.domain.Employee;

public interface EmployeeService {

	public Employee insert(Employee employee);

	public Employee findById(int eno);

	public void deleteById(int eno);
}
