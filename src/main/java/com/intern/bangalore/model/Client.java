package com.intern.bangalore.model;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Client {
    @Id
    private int clientId;
    private String clientName;

    @OneToMany(mappedBy = "client")
    private Collection<WorkWith> sale = new ArrayList<>();
    
    public Client(int clientId, String clientName) {
        this.clientId = clientId;
        this.clientName = clientName;
    }

    public Client() {
        super();
    }
    
    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    @Override
    public String toString() {
        return "Client [clientId=" + clientId + ", clientName=" + clientName + "]";
    }

    
}
