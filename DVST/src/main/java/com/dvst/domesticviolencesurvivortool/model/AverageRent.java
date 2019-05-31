package com.dvst.domesticviolencesurvivortool.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name = "averagerent")
public class AverageRent {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long rentid;

    private String renttype;

    private int rent;


    @ManyToOne
    @JoinColumn(name = "stateid")
    @JsonIgnoreProperties("rent")
    private State state;

    public AverageRent() {

    }

    public AverageRent(String renttype, int rent) {
        this.renttype = renttype;
        this.rent = rent;
        this.state = state;
    }



    public long getRentid() {
        return rentid;
    }

    public void setRentid(long rentid) {
        this.rentid = rentid;
    }

    public String getRenttype() {
        return renttype;
    }

    public void setRenttype(String renttype) {
        this.renttype = renttype;
    }

    public int getRent() {
        return rent;
    }

    public void setRent(int rent) {
        this.rent = rent;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
