/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.mobpact.model;

import java.util.Date;

/**
 *
 * @author hp
 */
public class JobsFeeds {
    private String provider,imageProvider,description,type,place,link,imagejob;
    private Date date;
    private int id;

    public JobsFeeds() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public String getImageProvider() {
        return imageProvider;
    }

    public void setImageProvider(String imageProvider) {
        this.imageProvider = imageProvider;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getImagejob() {
        return imagejob;
    }

    public void setImagejob(String imagejob) {
        this.imagejob = imagejob;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
    
    
}
