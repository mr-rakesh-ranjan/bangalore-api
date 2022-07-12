package com.intern.bangalore.service;

import java.util.List;

import com.intern.bangalore.model.Employee;
// import com.intern.bangalore.model.WorkWith;
import com.intern.bangalore.model.ReqDel;

public interface EmployeeService {
    public Employee getEmployee(int id);
    // public WorkWith getDetails(String name);
    public List<ReqDel> getdel(String cname);
}
