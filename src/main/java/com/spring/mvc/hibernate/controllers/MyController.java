package com.spring.mvc.hibernate.controllers;

import com.spring.mvc.hibernate.dao.EmployeeDao;
import com.spring.mvc.hibernate.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/api")
public class MyController {

    @Autowired
    private EmployeeDao employeeDao;

    @RequestMapping("/employees")
    public String showAllEmployees(Model model){
        List<Employee>allEmployees = employeeDao.getAllEmployess();
        model.addAttribute("allEmps", allEmployees);
        return "all_Employees";
    }

//    @GetMapping("/employees/{id}")
//    public Employee getEmployee(@PathVariable int id){
//        Employee employee = employeeDao.getEmployee(id);
//
//        if(employee==null){
//            throw new NoSuchEmployee("We do not have employee with "+ id + " id.");
//        }
//
//        return employee;
//    }
//
//    @PostMapping("/employees")
//    public Employee addNewEmp(@RequestBody Employee employee){
//        employeeDao.saveEmployee(employee);
//        return employee;
//    }
//
//    @PutMapping("/employees")
//    public Employee updateEmp(@RequestBody Employee employee){
//        employeeDao.saveEmployee(employee);
//        return employee;
//    }
//
//    @DeleteMapping("/employees/{id}")
//    public String deleteEmp(@PathVariable int id){
//        Employee emp = employeeDao.getEmployee (id);
//        if(emp==null){
//            throw new NoSuchEmployee
//                    ("What a fuck? We do not have guy with id = " +id+" to delete him");
//        }
//        employeeDao.delete (id);
//        return "Ha ha ha. Employee with id "+ id + " deleted!!! Good luck motherfucker!!!";
//    }
}
