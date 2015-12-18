/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.mobpact.model;

import java.util.HashSet;
import java.util.Set;


/**
 *
 * @author hp
 */
public class Participant {
    private int participantId;
    private String name,community,imageProfile,email;
    private double lat,longt;
    private transient Set<Feeds> feedses = new HashSet<Feeds>();
    
    
    public Participant() {
    }



    public int getParticipantId() {
        return participantId;
    }

    public void setParticipantId(int participantId) {
        this.participantId = participantId;
    }

  

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCommunity() {
        return community;
    }

    public void setCommunity(String community) {
        this.community = community;
    }

    public String getImageProfile() {
        return imageProfile;
    }

    public void setImageProfile(String imageProfile) {
        this.imageProfile = imageProfile;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLongt() {
        return longt;
    }

    public void setLongt(double longt) {
        this.longt = longt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

   
   
    public Set<Feeds> getFeedses() {
        return feedses;
    }

    public void setFeedses(Set<Feeds> feedses) {
        this.feedses = feedses;
    }

   
    public void addFeed(Feeds feeds) {
		feeds.setParticipant(this);
                this.feedses.add(feeds);
		
	}

  

  
    
    
   
    
    
    
    
    
}
