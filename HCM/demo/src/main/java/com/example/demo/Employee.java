package com.example.demo;


import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="employee")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class Employee {

	@Id
	@Column(name="e_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Integer e_id;
	
	
	@ManyToOne(fetch=FetchType.LAZY,optional=false)
	@JoinColumn(name="department_id",nullable=false)
	Department department;

	String e_name;
	String pass;
	double salary;
	String email;
	int phone_no;
	String address;
	int age;
	LocalDate dob;
	LocalDate doj;
	
	

	public Employee() {
		
	}
	
		
	public Employee(Integer e_id, String e_name, String pass, double salary, String email, int phone_no,String add, int age,
			LocalDate dob, LocalDate doj) {
		super();
		this.e_id = e_id;
		this.e_name = e_name;
		this.pass = pass;
		this.salary = salary;
		this.email = email;
		this.phone_no = phone_no;
		this.address=add;
		this.age = age;
		this.dob = dob;
		this.doj = doj;
		
	}

	public Integer getE_id() {
		return e_id;
	}

	public void setE_id(Integer e_id) {
		this.e_id = e_id;
	}

	public String getE_name() {
		return e_name;
	}

	public void setE_name(String e_name) {
		this.e_name = e_name;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getPhone_no() {
		return phone_no;
	}

	public void setPhone_no(int phone_no) {
		this.phone_no = phone_no;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public LocalDate getDoj() {
		return doj;
	}

	public void setDoj(LocalDate doj) {
		this.doj = doj;
	}

	
	
	
	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public Department getDepartment() {
		return department;
	}


	public void setDepartment(Department department) {
		this.department = department;
	}


	@Override
	public String toString() {
		return "Employee [e_id=" + e_id + ", e_name=" + e_name + ", pass=" + pass + ", salary=" + salary + ", email="
				+ email + ", phone_no=" + phone_no + ", address=" + address + ", age=" + age + ", dob=" + dob + ", doj="
				+ doj + ", ]";
	}

	

}
