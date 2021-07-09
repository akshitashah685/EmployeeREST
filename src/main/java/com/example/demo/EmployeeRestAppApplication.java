package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;

@SpringBootApplication
public class EmployeeRestAppApplication implements CommandLineRunner{

	@Autowired
	EmployeeRepository employeeRepository;
	public static void main(String[] args) {
		SpringApplication.run(EmployeeRestAppApplication.class, args);
		System.out.println("Running");
	}
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		employeeRepository.save(new EmployeeRest("ABC","Devops",3434323));
		employeeRepository.save(new EmployeeRest("XYZ","Security",4323234));
		employeeRepository.save(new EmployeeRest("UVW","Programming",3232311));
		employeeRepository.save(new EmployeeRest("GHI","Security",2211121));
		System.out.println("Employees added by default");
		
	}

}
