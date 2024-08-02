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

@RestController
public class DepartmentController {
	
	

    @Autowired
    private DepartmentRepository departmentRepository;

    // Endpoint to retrieve all departments
    @GetMapping("/allDept")
    public List<Department> getAllDepartments() {
        return (List<Department>) departmentRepository.findAll();
    }

//    // Endpoint to retrieve a department by ID
//    @GetMapping("/{id}")
//    public List<Department> getDepartmentById(@PathVariable long id) {
//        return departmentRepository.findById(id);
//    }

    // Endpoint to save or update a department
    @PostMapping("/saveDept")
    public Department saveDepartment(@RequestBody Department department) {
        return departmentRepository.save(department);
    }

    // Endpoint to update a department
    @PutMapping("/saveupdtDept")
    public Department updateDepartment(@RequestBody Department department) {
        return departmentRepository.save(department);
    }

    // Endpoint to delete a department by ID
    @DeleteMapping("/dept/{id}")
    public void deleteDepartment(@PathVariable Integer id) {
        departmentRepository.deleteById(id);
    }
}



