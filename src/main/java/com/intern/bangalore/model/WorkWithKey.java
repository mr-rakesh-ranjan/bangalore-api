package com.intern.bangalore.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class WorkWithKey implements Serializable {
    
    @Column(name = "emp_id")
    private int empId;
    @Column(name = "client_id")
    private int clientId;
    public int getEmpId() {
        return empId;
    }
    public void setEmpId(int empId) {
        this.empId = empId;
    }
    public int getClientId() {
        return clientId;
    }
    public void setClientId(int clientId) {
        this.clientId = clientId;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + clientId;
        result = prime * result + empId;
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        WorkWithKey other = (WorkWithKey) obj;
        if (clientId != other.clientId)
            return false;
        if (empId != other.empId)
            return false;
        return true;
    }

    
}
