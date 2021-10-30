/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.assignment4.model;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author An
 */
public class Person {
    private String name;
    private int age;
    private int id;
    private Residence residence;
    private boolean isPatient;
    private double bloodPressure;
    private  ArrayList<Encounter> encounterHistory;
    private static int count =0;
    @Override
    public String toString() {
        return name;
    }
    
    
    public Person() {
        count++;
        this.id = count;
    }
    
    public Person(String name, int age, Residence residence,double bloodPressure) {
        count++;
        this.id = count;
        this.name = name;
        this.age = age;
        this.residence = residence;
        this.bloodPressure = bloodPressure;
        this.encounterHistory = new ArrayList<>();
    }
    
    public Person(String name, int age, Residence residence, double bloodPressure, boolean isPatient, ArrayList<Encounter> encounterHistory) {
        count++;
        this.id = count;
        this.name = name;
        this.age = age;
        this.residence = residence;
        this.isPatient = isPatient;
        this.bloodPressure = bloodPressure;
        this.encounterHistory = encounterHistory;
    }

    public int getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Residence getResidence() {
        return residence;
    }

    public void setResidence(Residence residence) {
        this.residence = residence;
    }

    public boolean isIsPatient() {
        return isPatient;
    }

    public void setIsPatient(boolean isPatient) {
        this.isPatient = isPatient;
    }

    public double getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(double bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public ArrayList<Encounter> getEncounterHistory() {
        return encounterHistory;
    }

    public void setEncounterHistory(ArrayList<Encounter> encounterHistory) {
        this.encounterHistory = encounterHistory;
    }

 
    
}
