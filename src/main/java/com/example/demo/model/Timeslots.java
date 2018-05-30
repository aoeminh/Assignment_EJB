package com.example.demo.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Timeslots {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private long datecreate;//1:8h-12h; 2: 13h-17h30: 3: 18h-21h30;

    public Timeslots() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getDatecreate() {
        return datecreate;
    }

    public void setDatecreate(long datecreate) {
        this.datecreate = datecreate;
    }
}
