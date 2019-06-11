package com.sapphire.model;

import javax.persistence.*;

@Entity
@Table(name = "employees")
public class Employee {
    @Id
    @Column(name = "employee_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer employeeId;

    @Column(name = "name")
    private String name;

    @Column(name = "salary")
    private Double salary;

    @Column(name = "desination")
    private String desination;

    public Integer getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Double getSalary() {
        return salary;
    }
    public void setSalary(Double salary) {
        this.salary = salary;
    }
    public String getDesination() {
        return desination;
    }
    public void setDesination(String desination) {
        this.desination = desination;
    }
}
