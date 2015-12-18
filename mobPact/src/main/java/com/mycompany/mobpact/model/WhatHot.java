/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.mobpact.model;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author hp
 */
public class WhatHot implements Serializable{
    private int hotId;
     private Date timestamp;
     private String name;
     private String image;
     private String status;
     private String profilepic;
     private String url;

    public WhatHot() {
    }

    public int getHotId() {
        return hotId;
    }

    public void setHotId(int hotId) {
        this.hotId = hotId;
    }

   

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getProfilepic() {
        return profilepic;
    }

    public void setProfilepic(String profilepic) {
        this.profilepic = profilepic;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
     
     
    
}
