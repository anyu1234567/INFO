/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.assignment4.model;

import java.util.*;

/**
 *
 * @author An
 */
public class Admin {
    private ArrayList<Person> personDirectory;
    private ArrayList<Person> patientDirectory;

    public ArrayList<Person> getPersonDirectory() {
        return personDirectory;
    }

    public void setPersonDirectory(ArrayList<Person> personDirectory) {
        this.personDirectory = personDirectory;
    }

    public ArrayList<Person> getPatientDirectory() {
        return patientDirectory;
    }

    public void setPatientDirectory(ArrayList<Person> patientDirectory) {
        this.patientDirectory = patientDirectory;
    }
    public void addPerson(Person p){
        if(p!=null)
            personDirectory.add(p);
    }
    public void DeletPerson(Person p ){
        this.personDirectory.remove(p);
    }

    public void addPatient(Person p) {
        this.patientDirectory.add(p);
    }
    public boolean isPatient(Person p){
        return patientDirectory.contains(p);
    }
    
    public void deletPatient(Person p){
        if(p!=null)
            patientDirectory.remove(p);
    }
    
}
