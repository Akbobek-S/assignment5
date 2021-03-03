package com.company.repositories.interfaces;

import com.company.entities.Employee;

import java.util.List;

public interface IEmpRepositories {
    boolean createEmp (Employee employee);
    Employee getEmployee(int id);
    List<Employee> getallEmployee();
}
