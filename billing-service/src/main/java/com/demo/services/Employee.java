package com.demo.services;


public class Employee {

	String empno;
	String empname;
	public String getEmpno() {
		return empno;
	}
	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", empname=" + empname + "]";
	}
	public void setEmpno(String empno) {
		this.empno = empno;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
}
