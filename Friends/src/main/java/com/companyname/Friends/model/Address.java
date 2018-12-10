package com.companyname.Friends.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

//@Embeddable
@Entity
public class Address {
    private String street;
    private String city;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @JsonBackReference
    @ManyToOne
    Friend friend;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
