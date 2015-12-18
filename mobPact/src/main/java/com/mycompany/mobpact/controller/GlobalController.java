/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mobpact.controller;

import com.mycompany.mobpact.model.Participant;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author xcg0744
 */
@ManagedBean
@RequestScoped
public class GlobalController {
    
    private Participant p;
    private List<Participant> participants;

    /**
     * Creates a new instance of GlobalController
     */
    public GlobalController() {
        p = new Participant();
        participants = new ArrayList<>();
        p.setName("Aymen");
        p.setEmail("googlemail");
        p.setParticipantId(1);
        p.setCommunity("Hamburg");
        participants.add(p);
    }

    public Participant getP() {
        return p;
    }

    public void setP(Participant p) {
        this.p = p;
    }

    public List<Participant> getParticipants() {
        return participants;
    }

    public void setParticipants(List<Participant> participants) {
        this.participants = participants;
    }
    
    
}
