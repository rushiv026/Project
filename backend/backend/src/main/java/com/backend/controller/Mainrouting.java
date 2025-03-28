package com.backend.controller;

import com.backend.entity.Emp;
import com.backend.repos.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/emp")
public class Mainrouting {

    @Autowired
    private EmployeeRepository repository;

    @PostMapping
    public Emp addEmployee(@RequestBody Emp employee) {
        System.out.println("agdyadygdujhgdu"+employee.getSalary());
        return repository.save(employee);
    }

    @GetMapping
    public List<Emp> getAllEmployees() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Emp getEmployeeById(@PathVariable Long id) {
        return repository.findById(id).orElseThrow(() -> new RuntimeException("Employee not found"));
    }

    @PutMapping("/{id}")
    public Emp updateEmployee(@PathVariable Long id, @RequestBody Emp updatedEmployee) {
        Emp existingEmployee = repository.findById(id).orElseThrow(() -> new RuntimeException("Employee not found"));
        existingEmployee.setName(updatedEmployee.getName());
        existingEmployee.setAddress(updatedEmployee.getAddress());
        existingEmployee.setSalary(updatedEmployee.getSalary());
        existingEmployee.setGender(updatedEmployee.getGender());
        existingEmployee.setEducation(updatedEmployee.getEducation());
        return repository.save(existingEmployee);
    }

    @DeleteMapping("/{id}")
    public String deleteEmployee(@PathVariable Long id) {
        repository.deleteById(id);
        return "Employee deleted successfully!";
    }
}
