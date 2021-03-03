package com.company;

import com.company.controller.EmployeeController;
import com.company.data.PostgresDB;
import com.company.data.interfaces.IDB;
import com.company.repositories.EmployeeRepositories;
import com.company.repositories.interfaces.IEmpRepositories;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        IDB db=new PostgresDB();
        IEmpRepositories repo = new EmployeeRepositories(db); {
            EmployeeController controller=new EmployeeController(repo);
            MyApplication app=new MyApplication(controller);
            app.start();
        }

    }
}
