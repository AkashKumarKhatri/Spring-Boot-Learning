package com.sapphire.service;

import com.sapphire.model.Employee;
import com.sapphire.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repository;

    public List<Employee> findAll() {
        return (List<Employee>) repository.findAll();
    }

    public Optional<Employee> getEmployee(Integer employeeId) {
        return repository.findById(employeeId);
    }

    public void addEmployee(Employee employee) {
        repository.save(employee);
    }

    public void updateEmployee(Integer employeeId, Employee updatedEmployee) throws Exception {
        Optional<Employee> employee1 = repository.findById(employeeId);
        if (!employee1.isPresent())
            throw new Exception("Could not find employee with id- " + employeeId);
        if (updatedEmployee.getName() == null || updatedEmployee.getName().isEmpty())
            updatedEmployee.setName(employee1.get().getName());
        if (updatedEmployee.getDesination() == null || updatedEmployee.getDesination().isEmpty())
            updatedEmployee.setDesination(employee1.get().getDesination());
        if (updatedEmployee.getSalary() == 0)
            updatedEmployee.setSalary(employee1.get().getSalary());
        updatedEmployee.setEmployeeId(employeeId);
        repository.save(updatedEmployee);
    }

    public void deleteEmployee(Integer employeeId) throws Exception{
        Optional<Employee> employee1 = repository.findById(employeeId);
        if (!employee1.isPresent())
            throw new Exception("Could not find employee with id- " + employeeId);
        repository.deleteById(employeeId);
    }
}
