package com.techdenovo.app.secondspringbootproject1.domain;


import com.sun.istack.NotNull;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long custId;
    @NotNull
    private String name;

    public Customer() {
    }

    public Customer(Long custId, String name) {
        this.custId = custId;
        this.name = name;
    }

    public Long getCustId() {
        return custId;
    }

    public void setCustId(Long custId) {
        this.custId = custId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Customer{" + "custId=" + custId + ", name='" + name + '\'' + '}';
    }
}
