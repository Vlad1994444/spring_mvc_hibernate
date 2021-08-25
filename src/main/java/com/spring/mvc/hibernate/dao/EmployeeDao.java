package com.spring.mvc.hibernate.dao;

import com.spring.mvc.hibernate.entity.Employee;;

import java.util.List;

public interface EmployeeDao {

    public List<Employee> getAllEmployess();

    public void saveEmployee(Employee employee);

    public Employee getEmployee(int id);

    public void delete(int id);
}
