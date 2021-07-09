package com.example.demo;

import javax.persistence.Entity;

@Entity
public class EmployeeRest {
	
	Integer empId;
	String empName;
	String empDept;
	Integer empSalary;
	public EmployeeRest() {
		// TODO Auto-generated constructor stub
		
	}
	
	public EmployeeRest(Integer empId, String empName, String empDept, Integer empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empDept = empDept;
		this.empSalary = empSalary;
	}

	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
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
	public Integer getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(Integer empSalary) {
		this.empSalary = empSalary;
	}

	@Override
	public String toString() {
		return "EmployeeRest [empId=" + empId + ", empName=" + empName + ", empDept=" + empDept + ", empSalary="
				+ empSalary + "]";
	}

	
}
