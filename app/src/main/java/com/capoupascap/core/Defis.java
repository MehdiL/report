package com.capoupascap.core;

import java.io.Serializable;
import java.util.GregorianCalendar;

/**
 * Created by Mehdi on 27/05/2015.
 */
public class Defis implements Serializable {
    private String id_defis;
    private User user;
    private String description;
    private GregorianCalendar datecrea;
    private boolean masque;

    public String getId_defis() {
        return id_defis;
    }

    public void setId_defis(String id_defis) {
        this.id_defis = id_defis;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public GregorianCalendar getDatecrea() {
        return datecrea;
    }

    public void setDatecrea(GregorianCalendar datecrea) {
        this.datecrea = datecrea;
    }

    public boolean isMasque() {
        return masque;
    }

    public void setMasque(boolean masque) {
        this.masque = masque;
    }
}
