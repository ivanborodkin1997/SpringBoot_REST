package com.ivanborodkin.rest.springboot_rest_test.entity;

import javax.persistence.*;

@Entity
@Table(name = "organizations1")
public class Organization {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "org_id")
    private int org_id;

    @Column(name = "organization_uuid")
    private String organization_uuid;

    @Column(name = "short_name")
    private String short_name;

    @Column(name = "inn")
    private int inn;

    @Column(name = "legal_address" )
    private String legal_address;

    @Column(name = "phone_number")
    private int phone_number;

    public Organization() {
    }

    public int getOrg_id() {
        return org_id;
    }

    public void setOrg_id(int org_id) {
        this.org_id = org_id;
    }

    public String getOrganization_uuid() {
        return organization_uuid;
    }

    public void setOrganization_uuid(String organization_uuid) {
        this.organization_uuid = organization_uuid;
    }

    public String getShort_name() {
        return short_name;
    }

    public void setShort_name(String short_name) {
        this.short_name = short_name;
    }

    public int getInn() {
        return inn;
    }

    public void setInn(int inn) {
        this.inn = inn;
    }

    public String getLegal_address() {
        return legal_address;
    }

    public void setLegal_address(String legal_address) {
        this.legal_address = legal_address;
    }

    public int getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(int phone_number) {
        this.phone_number = phone_number;
    }
}


