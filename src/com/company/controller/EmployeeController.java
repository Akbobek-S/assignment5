package com.company.controller;

import com.company.entities.Employee;
import com.company.repositories.interfaces.IEmpRepositories;

import java.util.List;

public class EmployeeController {
    private final IEmpRepositories repo;

    public EmployeeController(IEmpRepositories repo){this.repo=repo;}
    public String createEmployee(String name,String surname,String position,String status, String department){
        Employee employee=new Employee(name,surname, position, status, department);
        boolean created=repo.createEmp(employee);
        return (created?"User was created!":"User Creation was failed!");
    }
    public String getEmployee(int id){
        Employee employee=repo.getEmployee(id);
        return (employee==null?"Employee was not found!":employee.toString());
    }
    public String getallEmployees(){
        List<Employee>employees=repo.getallEmployee();

        return employees.toString();
    }


}
