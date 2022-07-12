package com.intern.bangalore.model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

@Entity
public class WorkWith {
    
    @EmbeddedId
    private WorkWithKey id;

    @ManyToOne
    @MapsId("empId")
    @JoinColumn(name = "emp_id")
    private Employee employee;

    @ManyToOne
    @MapsId("clientId")
    @JoinColumn(name = "client_id")
    private Client client;

    private int totalSales;

    public WorkWith(WorkWithKey id, Employee employee, Client client, int totalSales) {
        this.id = id;
        this.employee = employee;
        this.client = client;
        this.totalSales = totalSales;
    }

    public WorkWith() {
    }

    public WorkWithKey getId() {
        return id;
    }

    public void setId(WorkWithKey id) {
        this.id = id;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public int getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(int totalSales) {
        this.totalSales = totalSales;
    }

    
}
