package com.spring.mvc.hibernate.service;

import com.spring.mvc.hibernate.entity.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getAllEmployees();
    public void saveEmployee(Employee employee);
    public Employee getEmp(int id);
    public void deleteEmployee(int id);
}
