package com.example.hoangquoc.model;

import java.io.Serializable;

/**
 * Created by Hoang Quyen on 9/26/2016.
 */
public class Description implements Serializable {
    private String text;
    private String notes;
    private boolean status;
    private boolean pri;

    public String getNotes() {
        return notes;
    }

    public Description(String text, String notes, boolean status, boolean pri) {
        this.text = text;
        this.notes = notes;
        this.status = status;
        this.pri = pri;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean isPri() {
        return pri;
    }

    public void setPri(boolean pri) {
        this.pri = pri;
    }

    public Description() {

    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
