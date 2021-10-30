/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.assignment4.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author An
 */
public class Encounter  {
    private String encounterName;
    private String Vitalsign;
    private String TimeSlot;

    @Override
    public String toString() {
        return  encounterName;
    }

    public Encounter(String encounterName, String Vitalsign, String TimeSlot) {
        this.encounterName = encounterName;
        this.Vitalsign = Vitalsign;
        this.TimeSlot = TimeSlot;
    }

    

    public String getEncounterName() {
        return encounterName;
    }

    public void setEncounterName(String encounterName) {
        this.encounterName = encounterName;
    }

    
    public String getVitalsign() {
        return Vitalsign;
    }

    public void setVitalsign(String Vitalsign) {
        this.Vitalsign = Vitalsign;
    }

    public String getTimeSlot() {
        return TimeSlot;
    }

    public void setTimeSlot(String TimeSlot) {
        this.TimeSlot = TimeSlot;
    }
    
}
