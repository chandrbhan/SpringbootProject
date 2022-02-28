package com.shubham.entites;

import javax.persistence.*;

@Entity
@Table(name = "orgns_table",catalog = "orgns_database")
public class Organizations {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String organizationName;
    private String address;

    public Organizations() {
    }

    @Override
    public String toString() {
        return "Organizations{" +
                "id=" + id +
                ", organizationName='" + organizationName + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Organizations(Long id, String organizationName, String address) {
        this.id = id;
        this.organizationName = organizationName;
        this.address = address;
    }
}


