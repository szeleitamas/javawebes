package com.example.securityrole;

import javax.persistence.*;
/*Oprendszerek */
@Entity
@Table(name="oprendszerek")
public class Oprendszerek {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nev;
    private int darab;

    public Oprendszerek() {
    }

    public Oprendszerek(String nev, int darab) {
        this.nev = nev;
        this.darab = darab;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public int getDarab() {
        return darab;
    }

    public void setDarab(int darab) {
        this.darab = darab;
    }


}
