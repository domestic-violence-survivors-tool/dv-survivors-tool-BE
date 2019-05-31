package com.dvst.domesticviolencesurvivortool.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name = "averagerent")
public class AverageRent {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long rentid;

    private int studioroomapartmentrent;

    private int onebedroomapartmentrent;

    private int twobedroomapartmentrent;

    private int threebedroomapartmentrent;

    /////////////// I would of done this instead to make it more loosly cupled.
    ///
    /// private String renttype;
    ///
    /// private int rent;


    @ManyToOne
    @JoinColumn(name = "stateid")
    @JsonIgnoreProperties("rent")
    private State state;

    public AverageRent() {

    }
    public AverageRent(int studioroomapartmentrent, int onebedroomapartmentrent, int twobedroomapartmentrent, int threebedroomapartmentrent) {
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

    public int getStudioRoomApartmentRent() {
        return studioroomapartmentrent;
    }

    public void setStudioRoomApartmentRent(int studioroomapartmentrent) {
        this.studioroomapartmentrent = studioroomapartmentrent;
    }

    public int getOneBedRoomApartmentRent() {
        return onebedroomapartmentrent;
    }

    public void setOneBedRoomApartmentRent(int oneBedRoomApartmentRent) {
        this.onebedroomapartmentrent = onebedroomapartmentrent;
    }

    public int getTwoBedRoomApartmentRent() {
        return twobedroomapartmentrent;
    }

    public void setTwoBedRoomApartmentRent(int twobedroomapartmentrent) {
        this.twobedroomapartmentrent = twobedroomapartmentrent;
    }

    public int getThreeBedRoomApartmentRent() {
        return threebedroomapartmentrent;
    }

    public void setThreeBedRoomApartmentRent(int threebedroomapartmentrent) {
        this.threebedroomapartmentrent = threebedroomapartmentrent;
    }


    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
