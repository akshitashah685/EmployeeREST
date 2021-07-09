package com.example.demo;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class EmployeeController {

	@Autowired
	EmployeeRepository employeeRepository;
	
	
	
	@GetMapping("/employees")
	public List<EmployeeRest> getAllEmployees()
	{
		return (List<EmployeeRest>)employeeRepository.findAll();
	}
	
	@PostMapping("/employees")
	public String addEmployee(@RequestBody EmployeeRest e)
	{
		employeeRepository.save(e);
		return "Employee added";
	}
	
}
