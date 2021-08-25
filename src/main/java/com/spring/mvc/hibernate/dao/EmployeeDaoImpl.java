package com.spring.mvc.hibernate.dao;

import com.spring.mvc.hibernate.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void saveEmployee(Employee employee) {

        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(employee);
    }

    @Override
    @Transactional
    public List<Employee> getAllEmployess() {
        Session session = sessionFactory.getCurrentSession();
        List<Employee>allEmployees = session
                .createQuery("from Employee", Employee.class)
                .getResultList();
        /*another way. The same but in two lines
        Query<Employee> query = session.createQuery("from Employee ", Employee.class);
        List<Employee> allEmployees = query.getResultList();
         */
        return allEmployees;
    }

    @Override
    @Transactional
    public Employee getEmployee(int id) {
        Session session = sessionFactory.getCurrentSession();
        Employee employee = session.get(Employee.class, id);
        return employee;
    }

    @Override
    @Transactional
    public void delete(int id) {
        Session session = sessionFactory.getCurrentSession();
        Query<Employee> query = session.createQuery("delete from Employee "+
                " where id =:empID");
        query.setParameter("empID", id);
        query.executeUpdate();
    }
}
