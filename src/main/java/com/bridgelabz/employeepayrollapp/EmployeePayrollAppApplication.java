package com.bridgelabz.employeepayrollapp;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import static org.springframework.boot.SpringApplication.run;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class EmployeePayrollAppApplication {

    public static void main(String[] args) {
        run(EmployeePayrollAppApplication.class, args);
    }

}
