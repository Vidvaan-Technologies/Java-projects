package com.vidvaan.spring.boot.sprintbootapp.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vidvaan.spring.boot.sprintbootapp.domain.Employee;
import com.vidvaan.spring.boot.sprintbootapp.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	private static final Logger logger = LogManager.getLogger(EmployeeController.class);

	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/find/{eno}")
	public Employee find(@PathVariable(name = "eno") Integer eno) {
		logger.info("Find by eno :{}", eno);
		return employeeService.findById(eno);
	}
	//hello this is Ashraf

	@GetMapping("/deleteById/{eno}")
	public void deleteById(int eno) {
		employeeService.deleteById(eno);

	}

	@PostMapping("/save")
	public Employee insert(@RequestBody Employee employee) {
		System.out.println("insert succeess");
		return employeeService.insert(employee);
	}

}
