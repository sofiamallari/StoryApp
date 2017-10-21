package com.example.sofia.storyapp.model;

public class page {
    private int imageID;
    private int textId;
    private choice c1;
    private choice c2;
    private boolean finals=false;

    public page(int imageID, int textId, choice c1, choice c2) {
        this.imageID = imageID;
        this.textId = textId;
        this.c1 = c1;
        this.c2 = c2;
    }
    public page(int imageID, int textId) {
        this.imageID = imageID;
        this.textId = textId;
        this.finals=true;
    }

    public boolean isFinals() {
        return finals;
    }

    public void setFinals(boolean finals) {
        this.finals = finals;
    }

    public int getImageID() {
        return imageID;
    }

    public void setImageID(int imageID) {
        this.imageID = imageID;
    }

    public int getTextId() {
        return textId;
    }

    public void setTextId(int textId) {
        this.textId = textId;
    }

    public choice getC1() {
        return c1;
    }

    public void setC1(choice c1) {
        this.c1 = c1;
    }

    public choice getC2() {
        return c2;
    }

    public void setC2(choice c2) {
        this.c2 = c2;
    }
}
