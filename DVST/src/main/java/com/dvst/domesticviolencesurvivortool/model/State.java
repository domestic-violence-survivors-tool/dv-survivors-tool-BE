package com.dvst.domesticviolencesurvivortool.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "state")
public class State {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long stateid;

    private String state;

    @OneToMany(mappedBy = "state", cascade = CascadeType.ALL)
    @JsonIgnoreProperties("state")
    private List<AverageRent> rent = new ArrayList<>();

    public State() {

    }
    public State(String state) {
        this.state = state;
    }


    public long getStateid() {
        return stateid;
    }

    public void setStateid(long stateid) {
        this.stateid = stateid;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public List<AverageRent> getRent() {
        return rent;
    }

    public void setRent(List<AverageRent> rent) {
        this.rent = rent;
    }
}
