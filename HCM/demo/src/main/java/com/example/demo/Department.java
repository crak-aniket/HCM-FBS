package com.example.demo;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="department")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class Department {
	
	
	@Id
	@Column(name="department_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Integer department_id;
	String d_name;

	
	@OneToMany(mappedBy="department",cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	@JsonIgnore
	List<Employee>employees;
	

	public Department() {
		
	}
	
	


	public String getD_name() {
		return d_name;
	}


	public void setD_name(String d_name) {
		this.d_name = d_name;
	}


	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

}
