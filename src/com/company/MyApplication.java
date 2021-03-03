package com.company;

import com.company.controller.EmployeeController;

import java.util.Scanner;

public class MyApplication {
    private final EmployeeController controller;
    private final Scanner scanner;
    public MyApplication(EmployeeController controller){
        this.controller=controller;
        scanner = new Scanner(System.in);
    }
    public void start(){
        while (true){
            System.out.println();
            System.out.println("Welcome to my application");
            System.out.println("Select option:(1-3)");
            System.out.println("1) Get all employee");
            System.out.println("2) Get employee by id");
            System.out.println("3) Add an employee");
            System.out.println("0) Exit");
            System.out.println();
            try {
                System.out.println("Enter the option:(1-3)");
                int option = scanner.nextInt();
                if(option==1){

                }
                else if(option==2){

                }
                else if(option==3){

                }
                else{
                break;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
