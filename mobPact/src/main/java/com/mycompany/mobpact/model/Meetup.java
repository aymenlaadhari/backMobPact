/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.mobpact.model;


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author hp
 */
public class Meetup {
   private int idMeet;
	private String nameMeet,cause,description,email;
	private double lat,ln;
	private Date date;
        private Set<String> meetParticipants = new HashSet<String>();


    public Meetup() {
    }

    public Meetup(int id, String name, String cause, String description, double lat, double ln, Date date) {
        this.idMeet = id;
        this.nameMeet = name;
        this.cause = cause;
        this.description = description;
        this.lat = lat;
        this.ln = ln;
        this.date = date;
    }
    

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLn() {
        return ln;
    }

    public void setLn(double ln) {
        this.ln = ln;
    }

    public int getIdMeet() {
        return idMeet;
    }

    public void setIdMeet(int idMeet) {
        this.idMeet = idMeet;
    }

    public String getNameMeet() {
        return nameMeet;
    }

    public void setNameMeet(String nameMeet) {
        this.nameMeet = nameMeet;
    }

   

   
    
    
        

   

    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

   

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Set<String> getMeetParticipants() {
        return meetParticipants;
    }

    public void setMeetParticipants(Set<String> meetParticipants) {
        this.meetParticipants = meetParticipants;
    }

    public void addParticipants(String name)
    {
        this.meetParticipants.add(name);
    }
     
}
