package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ch.qos.logback.core.status.Status;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeRepository emprepository;

	@GetMapping("/allEmp")
	public List<Employee> getEmployees() {
		
		return (List<Employee>)emprepository.findAll();	
	}
	
	@PostMapping("/saveEmp")
	public Employee saveEmployee(@RequestBody Employee emp) {
		
		return emprepository.save(emp);
	}

	@PutMapping("/saveEditEmp")
	public Employee editEmployee(@RequestBody Employee emp) {
		return emprepository.save(emp);
	
	}

//	@DeleteMapping("/delete/{id}")
//	public Status deleteEmployee(@PathVariable int id) {
//		
//		
//	 try {
//		emprepository.deleteById(id);
//	} catch (Exception e) {
//		
//		return new Status(false);
//	}
//	 return new Status(true);
//	}

	
	// Endpoint to delete an employee by ID
//    @DeleteMapping("/{id}")
//    public void deleteEmployee(@PathVariable long id) {
//        emprepository.deleteById(id);
//    }
}
