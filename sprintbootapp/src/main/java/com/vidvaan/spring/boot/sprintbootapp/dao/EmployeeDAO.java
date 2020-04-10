package com.vidvaan.spring.boot.sprintbootapp.dao;

import com.vidvaan.spring.boot.sprintbootapp.domain.Employee;

public interface EmployeeDAO {

	public Employee insert(Employee employee);

	public Employee findById(int eno);

	public void deleteById(int eno);
}
