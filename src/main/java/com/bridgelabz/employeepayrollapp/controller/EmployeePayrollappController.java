package com.bridgelabz.employeepayrollapp.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/employeepayrollservice")
public class EmployeePayrollappController {

    @GetMapping (value ={"/","/get","/1"})
    public String hello(){
        return "hello from bridgelabz!";
    }

    @PostMapping("/create/{name}/{salary}")
    public String add(@PathVariable String name , @PathVariable long salary ){
        return "name: "+name+"\n salary : "+salary;
    }

    @PutMapping("/update/{name}/{salary}")
    public String update(@PathVariable String name ,@PathVariable long salary){
        return "name : "+name+"\n salary : "+salary;
    }

    @DeleteMapping("/Delete/1")
    public String delete (){
        return "deleted";
    }

}
