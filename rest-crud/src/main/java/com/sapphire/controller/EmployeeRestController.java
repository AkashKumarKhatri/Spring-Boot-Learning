package com.sapphire.controller;

import com.sapphire.service.EmployeeService;
import com.sapphire.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeRestController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/employees")
    public List<Employee> findAll() {
        return (List<Employee>) employeeService.findAll();
    }

    @GetMapping("/employees/{id}")
    public Optional<Employee> getEmployee(@PathVariable Integer id) {
        return employeeService.getEmployee(id);
    }

    @PostMapping("/employees")
    public void addEmployee(@RequestBody Employee employee) {
        employeeService.addEmployee(employee);
    }

    @PutMapping("/employees/{id}")
    public void updateEmployee(@RequestBody Employee employee, @PathVariable Integer id) throws Exception {
        employeeService.updateEmployee(id, employee);
    }

    @PutMapping("/employees/delete/{id}")
    public  void deleteEmployee(@PathVariable Integer id) throws Exception {
        employeeService.deleteEmployee(id);
    }
}
