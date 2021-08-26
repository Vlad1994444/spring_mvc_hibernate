package com.spring.mvc.hibernate.controllers;

import com.spring.mvc.hibernate.entity.Employee;
import com.spring.mvc.hibernate.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/*
start with URL "/api/employees"
 */

@Controller
@RequestMapping("/api")
public class MyController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("/employees")
    public String showAllEmployees(Model model) {
        List<Employee> allEmployees = employeeService.getAllEmployees();
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
    @RequestMapping("/addNewAmp")
    public String addNewEmp(Model model) {

        Employee employee = new Employee();
        model.addAttribute("emp", employee);

        return "employee_info";
    }

    @RequestMapping("/saveEmployee")
    public String saveEmployee(@ModelAttribute("emp") Employee employee) {

        employeeService.saveEmployee(employee);

        return "redirect:/api/employees";
    }

    @RequestMapping("/updateInfo")
    public String updateEmp(@RequestParam("empId") int id, Model model) {

        Employee employee = employeeService.getEmp(id);
        model.addAttribute("emp", employee);

        return "employee_info";

    }
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
