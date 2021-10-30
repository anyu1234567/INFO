/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.assignment4.model;

/**
 *
 * @author An
 */
public class Residence {
    private String House;
    private String community;
    private String city;


    public Residence(String House, String community, String city) {
        this.House = House;
        this.community = community;
        this.city = city;
    }

    public String getHouse() {
        return House;
    }

    public void setHouse(String House) {
        this.House = House;
    }

    public String getCommunity() {
        return community;
    }

    public void setCommunity(String community) {
        this.community = community;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    
}
