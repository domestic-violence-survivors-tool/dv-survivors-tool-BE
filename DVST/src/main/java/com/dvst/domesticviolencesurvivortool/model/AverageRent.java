package com.dvst.domesticviolencesurvivortool.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name = "averagerent")
public class AverageRent {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long rentid;

    private String sharedbedroomrent;

    private String studioroomapartmentrent;

    private String onebedroomapartmentrent;

    private String twobedroomapartmentrent;

    private String threebedroomapartmentrent;

    @ManyToOne
    @JoinColumn(name = "stateid")
    @JsonIgnoreProperties("rent")
    private State state;

    public AverageRent() {

    }
    public AverageRent(String sharedbedroomrent, String studioroomapartmentrent, String onebedroomapartmentrent, String twobedroomapartmentrent, String threebedroomapartmentrent) {
        this.sharedbedroomrent = sharedbedroomrent;
        this.studioroomapartmentrent = studioroomapartmentrent;
        this.onebedroomapartmentrent = onebedroomapartmentrent;
        this.twobedroomapartmentrent = twobedroomapartmentrent;
        this.threebedroomapartmentrent = threebedroomapartmentrent;
        this.state = state;
    }


    public long getRentid() {
        return rentid;
    }

    public void setRentid(long rentid) {
        this.rentid = rentid;
    }

    public String getSharedBedroomRent() {
        return sharedbedroomrent;
    }

    public void setSharedBedroomRent(String sharedbedroomrent) {
        this.sharedbedroomrent = sharedbedroomrent;
    }

    public String getStudioRoomApartmentRent() {
        return studioroomapartmentrent;
    }

    public void setStudioRoomApartmentRent(String studioroomapartmentrent) {
        this.studioroomapartmentrent = studioroomapartmentrent;
    }

    public String getOneBedRoomApartmentRent() {
        return onebedroomapartmentrent;
    }

    public void setOneBedRoomApartmentRent(String oneBedRoomApartmentRent) {
        this.onebedroomapartmentrent = onebedroomapartmentrent;
    }

    public String getTwoBedRoomApartmentRent() {
        return twobedroomapartmentrent;
    }

    public void setTwoBedRoomApartmentRent(String twobedroomapartmentrent) {
        this.twobedroomapartmentrent = twobedroomapartmentrent;
    }

    public String getThreeBedRoomApartmentRent() {
        return threebedroomapartmentrent;
    }

    public void setThreeBedRoomApartmentRent(String threebedroomapartmentrent) {
        this.threebedroomapartmentrent = threebedroomapartmentrent;
    }


    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
