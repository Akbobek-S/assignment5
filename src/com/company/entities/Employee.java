package com.company.entities;

public class Employee {
    private int id;
    private String name;
    private String surname;
    private String position;
    private String status;
    private String department;

    public Employee(int id, String name,String surname,String position,String status, String department){
        setId(id);
        setName(name);
        setSurname(surname);
        setPosition(position);
        setStatus(status);
        setDepartment(department);
    }

    public Employee(String name, String surname, String position, String status, String department) {
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void EmpInfo(){
        System.out.println("Employee "+ getName() + getSurname() + " with id "+getId()+
                           "works as"+ getPosition()+"in"+getDepartment());
    }
}

