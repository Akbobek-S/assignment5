package com.company.entities;

public class BackendDev extends Employee{
    public static int deadline;
    public static int Bonus;
    public static int Penalty;
    private int spendTime;
    private int Salary;

    public BackendDev(int id, String name,String surname,String position,String status, String department) {
        super(id, name,surname,position, status, department);
    }
    public void setSalary(int money){
        this.Salary=money;}

    public int gettingSalary(){
        return Salary;
    }

    public String programs() {
        return super.getName() + " programs in "+ super.getDepartment()+" department";
    }

    public String work() {
        return super.getName() + " works in IT company as Backend developer.";
    }

    public String getSalary() {
        return "He get salary "+gettingSalary()+"$ per month.";
    }

    public int getBonus() {
        return Bonus;
    }

    public int getPenalty() {
        return Penalty;
    }
    public String checking() {
        if (deadline < spendTime)
            return "He got bonus in "+getBonus()+"$ for early done.";

        else
            return "He got penalty in "+getPenalty()+"$ tg for late";
    }
    public void BackendInfo(){
        System.out.println(programs());
        System.out.println(work());
        System.out.println(getSalary());
        System.out.println(checking());
    }

}
