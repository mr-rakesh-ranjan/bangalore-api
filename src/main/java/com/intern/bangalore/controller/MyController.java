package com.intern.bangalore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.intern.bangalore.model.Employee;
import com.intern.bangalore.model.ReqDel;
// import com.intern.bangalore.model.WorkWith;
import com.intern.bangalore.service.EmployeeServiceImpl;

@RestController
@CrossOrigin("*")
public class MyController {

    @Autowired
    private EmployeeServiceImpl employeeServiceImpl;

    @GetMapping("/home")
    public String home(){
        return "this is test api for intern";
    }

    @GetMapping("/empl/{id}")
    public Employee getEmpById(@PathVariable int id) {
        return this.employeeServiceImpl.getEmployee(id);
        
    }

    // @GetMapping("/empl/{clientName}")
    // public WorkWith getWith(@PathVariable String clientName){
    //     return this.employeeServiceImpl.getDetails(clientName);
    // }

    @GetMapping("/details/{client_name}")
    public List<ReqDel> getWorkWith(@PathVariable String client_name) {
        return this.employeeServiceImpl.getdel(client_name);
    }

    
}
