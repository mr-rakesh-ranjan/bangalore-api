package com.intern.bangalore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intern.bangalore.dao.EmployeeDao;
import com.intern.bangalore.model.Employee;
import com.intern.bangalore.model.ReqDel;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeDao employeeDao;

    @Override
    public Employee getEmployee(int id) {
        return this.employeeDao.findEmployeeById(id);
    }


    // @Override
    // public WorkWith getDetails(String name) {
    //     return this.employeeDao.findWithName(name);
    // }

    @Override
    public List<ReqDel> getdel(String cname) {
        return this.employeeDao.findDetailsByName(cname);
    }

    
}
