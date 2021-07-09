package com.example.demo;

import javax.persistence.Entity;

@Entity
public class EmployeeRest {
	
	int empId;
	String empName;
	String empDept;
	int empSalary;
	public EmployeeRest() {
		// TODO Auto-generated constructor stub
		
	}
	
	public EmployeeRest(int empId, String empName, String empDept, int empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empDept = empDept;
		this.empSalary = empSalary;
	}

	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpDept() {
		return empDept;
	}
	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}
	public int getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}

	@Override
	public String toString() {
		return "EmployeeRest [empId=" + empId + ", empName=" + empName + ", empDept=" + empDept + ", empSalary="
				+ empSalary + "]";
	}

	
}
